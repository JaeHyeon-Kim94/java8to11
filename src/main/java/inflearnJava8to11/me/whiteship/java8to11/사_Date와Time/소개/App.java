package me.whiteship.java8to11.사_Date와Time.소개;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class App {
    public static void main(String[] args) throws InterruptedException {
        //1. java.util.Date 클래스는 mutable 하기 때문에 thead safe하지 않다.
        Date date = new Date();
        long time = date.getTime(); //사람용 시간이 아니라 기계용 시간임. 알아볼 수 X
                                    //(1970년 1월 1일 0시 0분 0초)부터 현재까지의 타임스탬프(Instant)
                                    //인류용 시간은 LocalDate
        System.out.println(date);
        System.out.println(time);

        Thread.sleep(1000 * 3);
        Date after3Seconds = new Date();
        System.out.println(after3Seconds);
        after3Seconds.setTime(time);
        System.out.println(after3Seconds);  //3초 전 시간으로 다시 돌아감. mutable하기 때문에 thread unsafe.


        //2. type unsafe
        // Date 객체에서 month는 0부터 시작한다거나, year month, dat 등의 매개변수에 int값을 받는 것. year에 -100이 들어갈 수도..



        //Joda Time의 Immutable한 LocalDate

        LocalDate dateOfBirth = LocalDate.of(1994, Month.MARCH, 27);
        LocalDate nowBirthDay = dateOfBirth.plusYears(28);

        //plusYears시 기존 객체가 변경되는 것이 아니라, 새로운 인스턴스 객체가 리턴됨.

        /*
            기간을 표현할 때는 Duration (시간 기반)과 Period (날짜 기반)를 사용할 수 있다.
            DateTimeFormatter를 사용해서 일시를 특정한 문자열로 포매팅할 수 있다.
        */


    }
}
