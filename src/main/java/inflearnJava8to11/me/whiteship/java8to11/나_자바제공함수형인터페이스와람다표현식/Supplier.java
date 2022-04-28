package me.whiteship.java8to11.나_자바제공함수형인터페이스와람다표현식;

public class Supplier {
    public static void main(String[] args) {
        //Supplier<T>는 인자 없이 T를 리턴한다.
        java.util.function.Supplier<Integer> get10 = ()-> 10;

        System.out.println(get10.get());
    }
}
