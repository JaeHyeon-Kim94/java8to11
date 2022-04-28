package me.whiteship.java8to11.라_인터페이스의변화.자바8API의기본메소드와스태틱메소드;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class App {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("jaehyeon");
        names.add("whiteship");
        names.add("toby");
        names.add("foo");
        //1. forEach
        //anonymous class, lambda에서 어떻게 바뀌는 건지 생각
        names.forEach(System.out::println);
        /*  <<RESULT>>
            jaehyeon
            whiteship
            toby
            foo
        */


        //2. spliterator
        //iterator처럼 활용가능. 쪼갤수 있는 기능을 가진 iterator.
        //iterator의 hasNext가 여기선 tryAdvance
        Spliterator<String> spl = names.spliterator();
        //split할 수 있는 기능 trySplit()
        Spliterator<String> spl2 = spl.trySplit();
        while(spl.tryAdvance(System.out::println));



        System.out.println("====================");
        while(spl2.tryAdvance(System.out::println));


        /*  <<RESULT>>
            toby        //역전되어 나온다.
            foo
            ====================
            jaehyeon
            whiteship
         */


        //3. stream
        long k = names.stream().map(String::toUpperCase)
                                .filter(s->s.startsWith("J"))
                                .count();

        System.out.println(k);  //<<RESULT>> : 1

        //4. reomveIf
        names.removeIf(s->s.startsWith("J"));   //jaehyeon 삭제


        //5. reversed       (Comparator)
        //ㄱ
        names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        }.reversed());

        //ㄴ
        Comparator<String> cp = ((o1, o2) -> o1.compareToIgnoreCase(o2));
        names.sort(cp.reversed());

        //ㄷ
        Comparator<String> cp2 = String::compareToIgnoreCase;
        names.sort(cp.reversed());

        
        /*
        * 이외에도
        * thenComparing()
        * static reverseOrder(), naturalOrder()
        * static nullsFirst(), nullsLast()
        * static comparing()
        * 찾아볼것
        * */

    }
}
