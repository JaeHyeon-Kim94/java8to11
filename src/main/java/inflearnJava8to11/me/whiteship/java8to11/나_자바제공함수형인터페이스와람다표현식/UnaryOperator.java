package me.whiteship.java8to11.나_자바제공함수형인터페이스와람다표현식;

public class UnaryOperator {
    public static void main(String[] args) {
        //같은 타입의 인자와 결과값. 따라서 제너릭도 하나
        java.util.function.UnaryOperator<Integer> plus10 = (i) -> i+10;
        //Function 인터페이스를 상속받았기 때문에 apply 사용가능.
        plus10.apply(2);
    }

}
