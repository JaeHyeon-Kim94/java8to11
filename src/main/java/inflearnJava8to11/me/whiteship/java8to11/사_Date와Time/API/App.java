package me.whiteship.java8to11.사_Date와Time.API;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class App {
    public static void main(String[] args) {

        //가. 시간

        //1. 기계용 시간 (메서드 실행시간을 측정하는 경우 등에 사용)
        Instant instant = Instant.now();
        System.out.println(instant);    //기준시 UTC, GMT 기준임.

        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone);
        ZonedDateTime zonedDateTime = instant.atZone(zone);
        System.out.println(zonedDateTime);




        //2. 사람용 시간
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        //로컬 정보를 토대로 시간을 가져오는 것이기 때문에 서버 배포를 다른 지역에 하게 되면 그 지역의 시간을 가져온다.

        LocalDateTime birthDay =
                LocalDateTime.of(1994, Month.MARCH, 27, 0, 0,0);

        ZonedDateTime nowInKorea = ZonedDateTime.now(ZoneId.of("America/Chicago"));
        System.out.println(nowInKorea);


        //나. 기간
        LocalDate today = LocalDate.now();
        LocalDate thisYearBirthday = LocalDate.of(2022, Month.MARCH, 27);
        //1. Period(사람용 기간)

        //11
        Period between = Period.between(today, thisYearBirthday);
        System.out.println(between.getDays());

        //1-2
        Period between1 = today.until(thisYearBirthday);
        System.out.println(between1.get(ChronoUnit.DAYS));



        //2. Duration(기계용 기간)
        Instant nowInstant = Instant.now();
        Instant plus = nowInstant.plus(10, ChronoUnit.SECONDS);
        Duration betweenDuration = Duration.between(nowInstant, plus);
        System.out.println(betweenDuration.getSeconds());


        //다. 포매팅과 파싱

        //1. 포매팅
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE_TIME);

        DateTimeFormatter MMddyyyy = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(dateTime.format(MMddyyyy));


        //2. 파싱
        LocalDate parse = LocalDate.parse("03/27/1994", MMddyyyy);
        System.out.println(parse);


        //라. 레거시 API 지원
        //GregorianCalendar와 Date 타입의 인스턴스를 Instant나 ZonedDateTime으로 변환 가능
        //Instant로 바꿀수만 있으면 ZonedDateTime이나 LocalDateTime으로 바꿀 수 있음.
        //Date to Instant
        Date newDate = new Date();
        Instant dateToInstant = newDate.toInstant();

        //Instant to Date
        Date instantToDate = Date.from(dateToInstant);


        //GregorianCalendar to LocalDateTime
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        ZonedDateTime gregorianToZonedDateTime = gregorianCalendar.toInstant().atZone(ZoneId.of("Asia/Seoul"));
        LocalDateTime zonedDateTimeToLocalDateTime = gregorianToZonedDateTime.toLocalDateTime();

        //LocalDateTime to GregorianCalendar
        GregorianCalendar.from(gregorianToZonedDateTime);


        //TimeZone to ZoneId
        ZoneId zoneId = TimeZone.getTimeZone("PST").toZoneId();

        //ZoneId to TimeZone
        TimeZone timeZone = TimeZone.getTimeZone(zoneId);

    }
}
