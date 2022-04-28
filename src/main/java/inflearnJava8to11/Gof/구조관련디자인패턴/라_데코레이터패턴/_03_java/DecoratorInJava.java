package Gof.구조관련디자인패턴.라_데코레이터패턴._03_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DecoratorInJava {
    public static void main(String[] args) {
        //Collections가 제공하는 데코레이터 메소드
        ArrayList list = new ArrayList<>();
        list.add(new Book());
        List books = Collections.checkedList(list, Book.class);

        list.add(new Item());
        books.add(new Item());      //checkedList때문에 Item이 들어갈 수 없어 ClassCastException 발생

        Collections.synchronizedCollection(list);
        List list1 = Collections.unmodifiableList(list);
        list1.add(new Book());//UnsupportedOperationException 발생 wrapper를 이용해 기능을 변경한 것.

//        HttpServletRequestWrapper requestWrapper;
//        HttpServletResponseWrapper responseWrapper;
    }

    private static class Book{

    }

    private static class Item{

    }
}
