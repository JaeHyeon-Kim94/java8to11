package me.whiteship.java8to11.나_자바제공함수형인터페이스와람다표현식;

public class Consumer {
    public static void main(String[] args) {
        java.util.function.Consumer<Integer> printT = (i) -> System.out.println(i);

        //Consumer의 accept는 void(리턴 값이 없음)이기 때문에 값을 받기만 하고 리턴이 없음.
        printT.accept(10);

    }
}
