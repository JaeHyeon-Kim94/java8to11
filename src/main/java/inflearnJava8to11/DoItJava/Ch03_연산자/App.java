package DoItJava.Ch03_연산자;

public class App {
    public static void main(String[] args) {
        //증감 연산자
        int value1 = 3;
        int value2 = 4;
        int value3 = 2 + value1-- + ++value2;

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);


        //비트 연산자
        System.out.println(3 & 10);             //0011 & 0110 -> 10 -> 2
        System.out.println(0b0011 & 0b1010);    // 10 -> 2
        System.out.println(0x03 & 0x0A);        // 3 & 10 -> 0011 & 0110 -> 10 -> 2


        //비교 연산자
        String a1 = "안녕";
        String a2 = "안녕";
        System.out.println(a1==a2); //왜 true인지 알아야. string constant pool


        //대입 연산자
        int value4 = 10;

        System.out.println(value4|=25);


    }
}
