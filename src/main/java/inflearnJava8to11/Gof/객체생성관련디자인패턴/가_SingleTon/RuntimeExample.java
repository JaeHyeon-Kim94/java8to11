package Gof.객체생성관련디자인패턴.가_SingleTon;

public class RuntimeExample {
    public static void main(String[] args) {
        //static final을 통한 SingleTon pattern
        Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime.freeMemory());
        System.out.println(runtime.maxMemory());


    }
}
