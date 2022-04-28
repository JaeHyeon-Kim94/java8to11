package me.whiteship.java8to11.아_CompletableFuture;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class AppCallableAndFuture {


    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        //가. Callable, Future
//        //Runnable은 리턴타입이 void이기 때문에 실행하고 끝.
//        //실행한 결과값을 받아오고 싶을 때 Callable 사용.
//
        ExecutorService exs1 = Executors.newSingleThreadExecutor();

    	Callable<String> hello = ()->{
    		Thread.sleep(2000L);
    		return "Hello";
    	};
//
    	Future<String> submitResult = exs1.submit(hello);
//
//        //작업상태 확인하기
    	System.out.println(submitResult.isDone());	//끝났으면 true, 안끝났으면 false
//
//        //작업 취소하기
//        submitResult.cancel(false);     //Interrupt 하면서 취소할 것인지 여부.
//                                        // true  : 현재 진행중인 쓰레드를 interrupt한다.
//                                        // false : 현재 진행중인 작업이 끝날때까지 기다림
//                                        // cancel하면 결과값 받아올 수 없음.
//                                        //isDone도 true가 됨.
//
//        System.out.println("Started!!");
//        //get() 이전까지는 기다리지 않고 코드가 실행되지만, get을 만난 순간 멈춰서 결과값을 가져올 때까지 기다림. (블로킹)
//        submitResult.get();     //결과값 꺼내기.
//
//        //작업상태 확인하기
//        System.out.println(submitResult.isDone());  //끝났으면 true 안끝났으면 false
//
//        System.out.println("End!!");
//        exs1.shutdown();


        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //invokeAll()
        ExecutorService exs2 = Executors.newSingleThreadExecutor();
        //invokeAny()   쓰레드풀로 하는 이유는, java가 먼저 들어갔는데 싱글쓰레드면 무조건 java의 결과가 출력. 자리가 없으니까.
        ExecutorService exs3 = Executors.newFixedThreadPool(4);

        Callable<String> java = ()->{
            Thread.sleep(4000L);
            return "java";
        };

        Callable<String> jaehyeon = ()->{
            Thread.sleep(3000L);
            return "jaehyeon";
        };

        Callable<String> callable = ()->{
            Thread.sleep(2000L);
            return "callable";
        };

        Callable<String> future = ()->{
            Thread.sleep(1000L);
            return "future";
        };
        //invokeAll : 예를 들어 java가 가장 먼저 끝났어도 다른 작업이 "모두" 끝날때까지 기다림.
        //              때문에 동시에 실행한 작업 중에 제일 오래 걸리는 작업 만큼 시간이 걸림.
//        List<Future<String>> futures = exs2.invokeAll(Arrays.asList(java, jaehyeon, callable, future));
//        for (Future<String> f : futures){
//            System.out.println(f.get());
//        }

        //invokeAny : 작업 중 가장 먼저 끝난 것을 가져옴. 여러 작업 중에 하나라도 먼저 응답이 오면 끝내기. 블록킹 콜.
        //              동시에 실행한 작업 중에 제일 짧게 걸리는 작업 만큼 시간이 걸림.
        //              invokeAll과 달리 Future가 아닌 제너릭에 정의한 타입으로 리턴.
        String invokeAnyResult = exs3.invokeAny(Arrays.asList(java, jaehyeon, callable, future));
        System.out.println(invokeAnyResult);

        exs2.shutdown();
        exs3.shutdown();





    }



}
