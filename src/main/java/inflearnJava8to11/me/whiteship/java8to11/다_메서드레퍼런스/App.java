package me.whiteship.java8to11.다_메서드레퍼런스;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args) {

        //메서드 레퍼런스
        //메서드를 참조하는 방법 4가지.


        //1. 메서드 레퍼런스(static)
        //스태틱 메서드 참조
        UnaryOperator<String> hi = (s) -> "Hi" + s;

        //hi 는 Greeting의 Hi 메서드와 똑같다. Greeting의 Hi 메서드를 사용한다면,
        UnaryOperator<String> greetingsHi = Greeting::hi;
                                                            //타입::스태틱 메서드
                                                            //greetingsHi만으로는 아무 일도 없다.
                                                            //apply를 해야 메서드 호출임.

        System.out.println(greetingsHi.apply("JaeHyeon" + "greetingsHi"));


        //2. 생성자 참조
        //타입::new
        Supplier<Greeting> greetingSupplier = Greeting::new;    //Supplier는 인자 없이 리턴값만 있음.
                                                                //따라서 기본 생성자 호출.
                                                                //Function 사용하면 name 인자 가진 생성자 호출
                                                                //인자와 리턴 같으면 Unary, 다르면 Function 일단은.

        Function<String, Greeting> greetingFunction = Greeting::new;    // 서로 다른 생성자를 호출한다.

        //주의할 점은 greetingSupplier나 greetingFunction은 Supplier 혹은 Function일 뿐이지 인스턴스 생성된게 아니다.

        //3. 특정 객체의 인스턴스 메서드 참조
        //객체 레퍼런스::인스턴스 메서드
        Greeting greetingSup = greetingSupplier.get();
        System.out.println(greetingSup.hello("JaeHyeon greetingSup"));

        Greeting greetingFunc = greetingFunction.apply("JaeHyeon");
        System.out.println(greetingFunc.hello(greetingFunc.getName() + "greetingFunc"));


        //4. 임의 객체의 인스턴스 메서드 참조
        //객체 레퍼런스::인스턴스 메서드
        String[] names = {"JaeHyeon", "whiteship", "toby"};

        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });

        Arrays.sort(names, ((o1, o2) -> 0));
        //임의의 인스턴스는 names의 각 문자열
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names)); //JaeHyeon, toby, whiteship


    }
}
