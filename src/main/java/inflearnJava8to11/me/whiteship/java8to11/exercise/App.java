package me.whiteship.java8to11.exercise;

import java.io.IOException;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws IOException {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );



/*
        1. 2011년에 일어난 모든 트랜잭션을 찾아 값을 오름차순으로 정리하시오.
        2. 거래자가 근무하는 모든 도시를 중복없이 나열하시오
        3. 케임브리지에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오
        4. 모든 거래자의 이름을 알파벳순으로 정리해서 반환하시오
        5. 밀라노에 거래자가 있는가?
        6. 케임브리지에 거주하는 거래자의 모든 트랜잭션값을 출력하시오
        7. 전체 트랜잭션 중 최댓값은 얼마인가?
        8. 전체 트랜잭션 중 최솟값은 얼마인가?
*/

//        //1
//        transactions.stream()
//                .filter(t->t.getYear()==2011)
//                .sorted(Comparator.comparing(Transaction::getValue))
//                .forEach(t-> System.out.println(t.getValue()));
//
////              .mapToInt(Transaction::getValue)
////              .sorted()
////              .forEach(System.out::println);
//
//
//        //2
//        transactions.stream()
//                .map(Transaction::getTrader)
//                .map(Trader::getCity)
//                .distinct()
//                .forEach(System.out::println);
//
//        //3
//        transactions.stream()
//                .map(Transaction::getTrader)
//                .filter(t->t.getCity().equals("Cambridge"))
//                .sorted(Comparator.comparing(Trader::getName))
//                .map(Trader::getName)
//                .distinct()
//                .forEach(System.out::println);
//
//
//        //4
//        transactions.stream()
//                .map(Transaction::getTrader)
//                .map(Trader::getName)
//                .distinct()
//                .sorted(Comparator.naturalOrder())
//                .forEach(System.out::println);
//
//
//        transactions.stream()
//                .map(Transaction::getTrader)
//                .map(Trader::getName)
//                .distinct()
//                .sorted((a, b)-> a.compareToIgnoreCase(b))
//                .forEach(System.out::println);
//
//
//        //5
//        boolean result = transactions.stream()
//                            .map(Transaction::getTrader)
//                            .anyMatch(t->t.getCity().equals("Milan"));
//        System.out.println(result);
//
//        //6
//        transactions.stream()
//                .filter(t->t.getTrader().getCity().equals("Cambridge"))
//                .map(Transaction::getValue)
//                .forEach(System.out::println);
//
//        //7
//        OptionalInt max1 = transactions.stream()
//                                  .mapToInt(Transaction::getValue)
//                                  .max();
//        if(max1.isPresent()) {
//            System.out.println(max1.getAsInt());
//        }
//
//        Optional max2 = transactions.stream()
//                                  .map(Transaction::getValue)
//                                  .reduce(Integer::max);
//        if(max2.isPresent()) {
//            System.out.println(max2.get());
//        }
//
//        //8
//        Optional min1 = transactions.stream()
//                            .map(Transaction::getValue)
//                            .reduce(Integer::min);
//                             /////
//        Optional min1_1 = transactions.stream()
//                                .map(Transaction::getValue)
//                                .min((o1, o2) -> o1.compareTo(o2));
//
//        if(min1.isPresent()){
//            System.out.println(min1.get());
//        }
//        if(min1_1.isPresent()){
//            System.out.println(min1_1.get());
//        }
//
//        OptionalInt min2 = transactions.stream()
//                                .mapToInt(Transaction::getValue)
//                                .min();
//        if(min2.isPresent()){
//            System.out.println(min2.getAsInt());
//        }
    }
}