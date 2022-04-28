package me.whiteship.java8to11.아_CompletableFuture;

public class AppConcurrentProgrammingIntro {

    //Concurrent 소프트웨어란 동시에 여러 작업을 할 수 있는 소프트웨어를 말함. 웹브라우저로 영상을 보면서 문서 타이핑(멀티태스킹.. 따지자면 다르지만)
    //자바에서 지원하는 컨커런트 프로그래밍 : 멀티프로세싱(ProcessBuilder), 멀티쓰레드(Thread, Runnable)

    public static void main(String[] args) throws InterruptedException {
        //가. 쓰레드를 만드는 방법

//        //1. 클래스 정의(run 메서드 오버라이딩, Thread 상속)
//        Thread1 thread1 = new Thread1();
//        thread1.start();
//
//        //2.Runnable 구현 or Lambda
//        Thread thread2 =
//                new Thread(()->System.out.println("Thread2: " + Thread.currentThread().getName()));
//        thread2.start();
//
//        //쓰레드의 실행 순서는 보장받을 수 없음. main이 먼저 실행되기도 하고 Thread1에서 먼저 실행되기도 함.
//        System.out.println("Hello" + Thread.currentThread().getName());


        //나. sleep, interrupt, join
        //sleep : 현재 쓰레드 멈춰두기.(다른 쓰레드가 처리할 수 있도록. 락을 놔주진 않음. 데드락 가능성)
        //interrupt : 다른 쓰레드를 깨워서 interruptedException을 발생시킴.
        //join : 다른 쓰레드가 끝날 때까지 기다린다.

//    	//1. sleep, interrupt
//        Thread thread3 = new Thread(()->{
//            while(true){
//                System.out.println("Thread : " + Thread.currentThread().getName());
//                try {
//                    Thread.sleep(1000L);       //현재 실행중인 쓰레드를 멈춘다.
//                } catch (InterruptedException e) {
//                    System.out.println("interrupted!");
//                    return;
//                }
//            }
//        });
//        thread3.start();
//        System.out.println("Hello : " + Thread.currentThread().getName());
//        Thread.sleep (3000L);
//        thread3.interrupt();
//        
//		/*
//		 * <Result>
//		 * 	Hello : main
//			Thread : Thread-0
//			Thread : Thread-0
//			Thread : Thread-0
//			interrupted!
//		*/
        

        //2. join
        Thread thread4 = new Thread(()->{
            System.out.println("Thread : " + Thread.currentThread().getName());
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        });
        thread4.start();

        System.out.println("Hello : " + Thread.currentThread().getName());
        thread4.join();     // main 쓰레드가 thread4가 끝날때 까지 기다린다. ~ is finished가 3초 후에 출력되며 종료된다.
                            // 대기하는 중에 thread4를 interrupt할 시 InterruptException 발생. join 부분에서.
                            // 쓰레드 제어는 이렇게 복잡하기 때문에 프로그래머가 관리할 수 없음. --> Executors
        System.out.println(thread4 + " is finished");
        
		/*
		 * <Result>
		Hello : main
		Thread : Thread-0
		Thread[Thread-0,5,] is finished
		*/
        
    }



    static class Thread1 extends Thread{
        @Override
        public void run() {
            System.out.println("Hello Thread1 : " + Thread.currentThread().getName());
        }
    }
}
