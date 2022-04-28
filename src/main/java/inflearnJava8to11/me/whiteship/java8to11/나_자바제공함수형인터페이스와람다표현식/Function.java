package me.whiteship.java8to11.나_자바제공함수형인터페이스와람다표현식;

public class Function {
    public static void main(String[] args) {
        //1. Function<A, B>.apply : A를 받아서 B를 리턴하는 함수형 인터페이스의 함수.
        //cf) BiFunction<T, U, R> : T와 U를 받아서 R를 리턴하는 함수.
        //A. 익명 내부 클래스
        java.util.function.Function<Integer, Integer> plus10 = new java.util.function.Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer + 10;
            }
        };
        System.out.println("plus10 Anonymous result : " + plus10.apply(10));
        //20

        //B. Lambda
        plus10 = (number) -> number + 10;

        System.out.println("plus10 Lambda result : " + plus10.apply(10));
        //20

        //2. T1.compose(T2) : T2 후 T1
        java.util.function.Function<Integer, Integer> multiply2 = (number) -> number*2;
        System.out.println("plus10.compose(mulyiply2) result : "+plus10.compose(multiply2).apply(2));
        //14


        //3. T1.andThen(T2) : T1 후 T2
        System.out.println("plus10.andThen(mulyiply2) result : "+plus10.andThen(multiply2).apply(10));
        //40

    }
}
