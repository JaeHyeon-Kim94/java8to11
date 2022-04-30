package Gof._02_structural_patterns._11_flyweight._03_java;

public class FlyweightInJava {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf(10);
        System.out.println(i1 == i2);

        Integer i3 = Integer.valueOf(10000);
        Integer i4 = Integer.valueOf(10000);

        System.out.println(i3 == i4);

        //valueOf라는 메서드는 자주 사용되는 값을 캐싱하고, -128 ~ 128의 범위에 있는 값들은 캐싱하고 있음.
        //10의 경우에는 true, 10000의 경우에는 false가 나오는 것을 확인할 수 있음.
    }
}
