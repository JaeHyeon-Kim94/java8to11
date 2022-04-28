package me.whiteship.java8to11.나_자바제공함수형인터페이스와람다표현식;

public class Predicate {
    public static void main(String[] args) {
        //인자를 받아서 True, False를 리턴해주는 함수.
        java.util.function.Predicate<String> startWithJaeHyeon = (s) -> s.startsWith("JaeHyeon");
        System.out.println(startWithJaeHyeon.test("JaeHyeon"));
        //startWithJaeHyeon.negate();
    }
}
