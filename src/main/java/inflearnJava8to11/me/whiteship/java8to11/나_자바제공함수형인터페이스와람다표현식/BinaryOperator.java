package me.whiteship.java8to11.나_자바제공함수형인터페이스와람다표현식;

import java.util.function.BiFunction;

public class BinaryOperator {
    //
    //1. java.util.function.BinaryOperator<T>
    //2. java.util.function.BiFunction<T, T, T>
    // 1과 2 둘 다 동일. 즉, BinaryOperator는 듕일한 타입의 인자 받아 동일한 타입 리턴.

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> sumBiFunction = (a, b) -> a+b;

        java.util.function.BinaryOperator<Integer> sumBinaryOperator = (a, b) -> a+b;


        Integer resultBiFunction = sumBiFunction.apply(5, 10);
        System.out.println("resultBiFunction : " + resultBiFunction);

        Integer resultBinaryOperator = sumBinaryOperator.apply(5, 10);
        System.out.println("resultBinaryOperator : " + resultBinaryOperator);


        java.util.function.Predicate<Integer> compareResult = number -> number.equals(resultBinaryOperator);

        System.out.println(compareResult.test(resultBiFunction));

    }


}
