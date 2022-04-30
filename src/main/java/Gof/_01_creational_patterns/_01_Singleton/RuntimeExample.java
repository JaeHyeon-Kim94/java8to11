package Gof._01_creational_patterns._01_Singleton;

public class RuntimeExample {
    public static void main(String[] args) {
        //static final을 통한 SingleTon pattern
        Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime.freeMemory());
        System.out.println(runtime.maxMemory());


    }
}
