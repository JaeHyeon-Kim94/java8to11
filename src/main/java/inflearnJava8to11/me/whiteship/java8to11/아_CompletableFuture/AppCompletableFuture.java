package me.whiteship.java8to11.아_CompletableFuture;

import java.util.Locale;
import java.util.concurrent.*;

public class AppCompletableFuture {
    //CompletableFuture을 통해 비동기 프로그래밍에 가까운 코딩 가능
    //Future의 문제점은 (1)여러 Future를 조합할 수 없다는 점, (2)예외처리용 API가 제공되지 않는다는 점,

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ExecutorService exs = Executors.newFixedThreadPool(4);
//        Future<String> future1 = exs.submit(() -> "hello");
//
//        future1.get();
//        exs.shutdown();
//        //(3) future1의 결과값을 받아서 무언가를 하는 것은 .get() 뒤에 와야 한다는 점.
//
//
//        //CompletableFuture : (1)외부에서 complete를 시킬 수 있음. (2)executor를 만들어서 쓸 필요 없음.
//        //1-1.
//        CompletableFuture<String> future2 = new CompletableFuture<>();
//        //결과값을 jaehyeon이라고 정해주면서 끝냄.
//        future2.complete("jaehyeon1");
//
//        System.out.println(future2.get());
//
//        //1-2. static factory method
//        CompletableFuture<String> future3 = CompletableFuture.completedFuture("jaehyeon2");
//        System.out.println(future3.get());
//
//        //2. 비동기로 어떠한 작업을 실행하고 싶으면, 리턴값이 없는 경우에는 runAsync(), 있는 경우에는 supplyAsync()
//        //2-1 runAsync()
//        CompletableFuture<Void> future4 = CompletableFuture.runAsync(()->{
//            System.out.println("Hello4" + Thread.currentThread().getName());
//        });
//        //상단은 future4만 정의한 것일 뿐 아무 일도 일어나지 않음. get() or join()을 통해 실행. join시 에러처리 알아서 해줌.(UncatchedException)
//        future4.join();


//        //2-2 supplyAsync()
//        CompletableFuture<String> future5 = CompletableFuture.supplyAsync(() -> {
//            System.out.println("Hello5" + Thread.currentThread().getName());
//            return "Hello supplyAsync";
//        });
//        System.out.println(future5.get());

        //여기까지는 Future와 비슷. 콜백처럼 활용하고자 한다면 Function을 받는 thenApply(Function) 활용.
        //return 필요없으면 thenAccept(Consumer), thenRun(Runnable) --> thenRun은 결과값을 참고하지 못함.

        CompletableFuture<String> future6 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Future6_1       " + Thread.currentThread().getName());
            return "Hello supplyAsync";
        }).thenApply((s)->{
            System.out.println("Future6_2       " + Thread.currentThread().getName());
            return s.toUpperCase();
        });
        //Future를 사용하는 경우에는 위처럼 결과값을 통해 일정한 작업을 수행하는 것을 .get() 이전에 정의하는 것이 불가능했음.


        //결과값을 보면 ForkJoinPool이 나오는데, 쓰레드를 본인이 제공하고 싶다면 Executors를 통해 supplyAsync의 두번째 인자로 제공.
        //제공한 쓰레드풀 이용해 작업처리.
        //콜백을 실행할 쓰레드풀을 분리하고싶다면 마찬가지로 콜백의 두번째 인자로 제공. thenApply는 thenApplyAsync로 변경.( ~ -> ~Async)
        ExecutorService exs2 = Executors.newFixedThreadPool(4);
        ExecutorService exs3 = Executors.newFixedThreadPool(4);
        CompletableFuture<String> future7 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Future7_1       " + Thread.currentThread().getName());
            return "Hello supplyAsync";
        }, exs2).thenApplyAsync((s)->{
            System.out.println("Future7_2       " + Thread.currentThread().getName());
            return s.toUpperCase();
        }, exs3);


 //       System.out.println("Future 6 result : " + future6.get());
 //       System.out.println("Future 7 result : " + future7.get());
        exs2.shutdown();
        exs3.shutdown();

    }

}
