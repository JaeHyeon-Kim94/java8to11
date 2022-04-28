package me.whiteship.java8to11.아_CompletableFuture;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class AppExecutors {
    public static void main(String[] args) {

        //가. Executors

        //쓰레드를 만들고 관리하는 고 수준의 API에게 위임함.
        //할 일을 Runnable에 정의하여 넘겨주면 쓰레드 관리를 위한 일련의 작업은 Executor에서 수행

        //cf) Fork/Join 프레임워크 : ExecutorService의 구현체를 사용해 멀티 프로세서 활용용
    	
    	ExecutorService exs1 = Executors.newSingleThreadExecutor();
    	exs1.submit(()-> System.out.println("Thread " + Thread.currentThread().getName()));
    	exs1.shutdown();
    	
        //주의! ExecutorService는 사용 후 명시적으로 셧다운 필수, 그렇지 않으면 계속 대기

        //ThreadPool이 2개이지만 5개의 작업을 실행한다고 했을 때, 두 개의 쓰레드를 가지고 번갈아가면서 실행됨.
        //Main에서는 5개의 작업을 ExecutorService에게 보내고, ExecutorService에선 Blocking Queue에 밀린 작업을 쌓아놓으며
        //ThreadPool에 있는 쓰레드에서 작업들을 번갈아가며 효율적으로 수행.
    	//cf.) ThreadPool은 Thread 생성에 드는 비용 측면에서 장점
    	

        ExecutorService exs2 = Executors.newFixedThreadPool(2);
//      exs.execute(()->System.out.println("Thread " + Thread.currentThread().getName()));
        exs2.submit(getRunnable("Hello"));
        exs2.submit(getRunnable("JaeHyeon"));
        exs2.submit(getRunnable("The"));
        exs2.submit(getRunnable("Java"));
        exs2.submit(getRunnable("Thread"));
        
        //execute와 submit의 차이.
		/*
		 * 병렬작업 처리가 많아지면 스레드의 개수가 증가하게 되면서 애플리케이션의 성능 저하로 이어질 수 있음.
		 * 따라서 쓰레드풀을 이용해 쓰레드의 숫자를 정해놓고 정해진 숫자의 쓰레드들이 작업Queue에 들어오는 작업들을 수행하게 함으로써 
		 * 급격한 성능저하는 막을 수 있음. 자바에서는 쓰레드풀을 위해 ExecutorService 인터페이스와 Executors클래스를 제공하는데,
		 * Executors의 정적 메서드를 통해 ExecutorService 구현 객체를 만들 수 있음.
		 * 그리고 쓰레드풀(ExecutorService)에서는 작업 처리를 위한 두 가지 메서드를 제공하는데, submit(R), execute(R).
		 * submit의 경우에는 작업처리 도중에 예외가 발생하더라도 스레드가 종료되지 않고 다음 작업을 위해 재사용되지만,
		 * execute의 경우에는 작업처리 도중에 예외가 발생하면 해당 스레드를 스레드풀에서 제거한 뒤에 새로운 스레드를 생성하여 다른 작업을 처리함.
		 * 오버헤드 방지를 위해서는 submit을 권장.
		*/
        //graceful shutdown : 현재 진행중인 작업을 끝까지 마치고 끝내는 것. <-> .shutdownNow() 즉시 끝내기
        exs2.shutdown();

        //특정 시간, 주기적으로 작업을 실행할 때 사용
        ScheduledExecutorService shcexs = Executors.newSingleThreadScheduledExecutor();
        shcexs.schedule(getRunnable("Hello"), 3, TimeUnit.SECONDS); //3초 있다가 실행
        shcexs.scheduleAtFixedRate(getRunnable("Hello"), 1, 2, TimeUnit.SECONDS);   //1초 기다렸다가 2초에 한번씩



        //나.




    }

    private static Runnable getRunnable(String message) {
        return () -> System.out.println(message + Thread.currentThread().getName());
    }
}
