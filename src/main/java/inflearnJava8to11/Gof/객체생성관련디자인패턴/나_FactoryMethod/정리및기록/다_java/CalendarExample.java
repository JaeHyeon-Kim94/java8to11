package Gof.객체생성관련디자인패턴.나_FactoryMethod.정리및기록.다_java;

import java.util.Calendar;
import java.util.Locale;

public class CalendarExample {
    public static void main(String[] args) {
        //단순한 팩토리 패턴
        //하나의 인터페이스와 여러개의 구현체가 아니라 하나의 구현체를 두고 여러 다른 구체적인 product를 만들어준다.
        System.out.println(Calendar.getInstance().getClass());
            //class java.util.GregorianCalendar
        System.out.println(Calendar.getInstance(Locale.forLanguageTag("th-TH-x-lvariant-TH")).getClass());
            //class sun.util.BuddhistCalendar
        System.out.println(Calendar.getInstance(Locale.forLanguageTag("ja-JP-x-lvariant-JP")).getClass());
            //class java.util.JapaneseImperialCalendar

        //파라미터의 형태에 따라 다른 객체를 return
    }
}
