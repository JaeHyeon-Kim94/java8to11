package me.whiteship.java8to11.마_스트림.스트림소개;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    /*
    * 스트림은 List, Map 컬렉션 등 연속된 데이터를 처리하는 Operation의 모음
    *sequence of elements supporting sequential and parallel aggregate operations
    *데이터를 담고 있는 저장소 (컬렉션)이 아니다.
    *Funtional in nature, 스트림이 처리하는 데이터 소스를 변경하지 않는다.
    *스트림으로 처리하는 데이터는 오직 한번만 처리한다.
    *무제한일 수도 있다. (Short Circuit 메소드를 사용해서 제한할 수 있다.)
    *중개 오퍼레이션(filter, map, limit, skip, sorted, ...)은 근본적으로 lazy 하다.
    **중개 오퍼레이션과 종료 오퍼레이션(collect, allMatch, count, forEach, min, max, ...)의 차이는 리턴타입.
    **중개 오퍼레이션은 스트림을 리턴하고 종료 오퍼레이션은 스트림을 리턴하지 않음.
    **스트림이 리턴되는 동안은 중개 오퍼레이션을 계속 사용할 수 있지만 스트림이 리턴되지 않으면 종료된다. 종료 오퍼레이션이 없으면
    **중개 오퍼레이션들은 수행되지 않는다.
    *       스트림 파이프라인
            ● 0 또는 다수의 중개 오퍼레이션 (intermediate operation)과 한개의 종료 오퍼레이션
            (terminal operation)으로 구성한다.
            ● 스트림의 데이터 소스는 오직 터미널 오퍼네이션을 실행할 때에만 처리한다.

    *손쉽게 병렬 처리할 수 있다.(parallelStream() :: spliterator 이용하여 스트림을 쪼개 병렬적으로 처리)
    *쓰레드를 만들고 컨텍스트 스위칭, 기타 작업들로 인한 자원소모가 있음. 무조건 병렬처리가 효율적인 것이 아니라
    *대이터가 방대할 경우 주로 사용.
    * */
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("jaehyeon");
        names.add("whiteship");
        names.add("toby");
        names.add("foo");

        List<String> collect = names.parallelStream().map(s->{
                             //names.stream().map(s->{
                            //Thread.currentThread().getName() 비교
            System.out.println(s + " " + Thread.currentThread().getName());

            return s.toUpperCase();
        }).collect(Collectors.toList());
    }

}
