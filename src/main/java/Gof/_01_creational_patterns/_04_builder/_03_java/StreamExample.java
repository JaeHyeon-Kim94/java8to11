package Gof._01_creational_patterns._04_builder._03_java;

import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Stream.Builder<String> stringStreamBuilder = Stream.builder();
        Stream<String> names1 = stringStreamBuilder.add("jaehyeon").add("whiteship").build();
        names1.forEach(System.out::println);

        //위 두줄을
        //Stream<String> names2 = Stream.builder().add("jaehyeon").add("whiteship").build();
        //이렇게는 바뀌지 않음.
        Stream<String> names2 = Stream.<String>builder().add("jaehyeon").add("whiteship").build();
        //제네릭

    }
}
