package DoItJava.Ch02_자료형;

public class App {
    public static void main(String[] args) {

        //float과 double의 정밀도 비교

        //float의 정밀도 : 대략 7자리
        float f1 = 1.0000001f;
        System.out.println(f1); //정상

        float f2 = 1.00000001f;
        System.out.println(f2); //오차 발생

        //double의 정밀도 : 대략 15자리
        double d1 = 1.000000000000001;
        System.out.println(d1);

        double d2 = 1.0000000000000001;
        System.out.println(d2);

        //////////////////////////////////////////////////////////////////////////////////////////

        //2진수 표현 : 0b + 숫자
        int binary = 0b11;
        System.out.println(binary);     //3

        //8진수 표현 : 0 + 숫자
        int octal =  011;
        System.out.println(octal);      //9

        //16진수 표현 : 0x + 숫자
        int hex = 0x11;
        System.out.println(hex);        //17


        //////////////////////////////////////////////////////////////////////////////////////////

        char characterByInteger1 = 65;
        char characterByInteger2 = 0xac00;
        char characterByInteger3 = 51;

        System.out.println(characterByInteger1);//A
        System.out.println(characterByInteger2);//가
        System.out.println(characterByInteger3);//3


        char characterByUnicode1 = '\u0041';
        char characterByUnicode2 = '\uac00';
        char characterByUnicode3 = '\u0033';

        System.out.println(characterByUnicode1);    //A
        System.out.println(characterByUnicode2);    //가
        System.out.println(characterByUnicode3);    //3


    }
}
