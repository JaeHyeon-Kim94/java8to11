package me.whiteship.java8to11.나_자바제공함수형인터페이스와람다표현식;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class ScopeAndEffectiveFinal {

    /*
    * 로컬 클래스와 익명 클래스, 람다 모두 final인 로컬변수 참고할 수 있음.
    * 또한 로컬변수에 final 붙지 않아도 사실상 final이라면 괜찮음.
    *
    *
    * 그러나 람다가 다른 점이 있음. 쉐도잉.
    *
    * 로컬 클래스나 익명 클래스는 쉐도잉 가능, 람다는 불가능
    *
    * 1. main 메서드 로컬변수로 선언된 baseNumber가 LocalClass의 printBaseNumber() 내에 선언된 baseNumber에 의해 가려짐.
    * 2. main 메서드 로컬변수로 선언된 baseNumber가 익명클래스 accept함수의 인자에 의해 가려짐.
    *   별도의 scope 때문.
    *
    * 그러나 람다는 람다를 감싸는 메서드, 클래스의 scope와 같은 scope를 가짐. 따라서 쉐도잉 일어나지 않음.
    *
    *
    * */

    public static void main(String[] args) {
        int baseNumber = 10;

        //로컬 클래스
        class LocalClass{
            void printBaseNumber(){
                int baseNumber = 11;
                System.out.println(baseNumber); //11
            }
        }


        //익명 클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer baseNumber) {
                System.out.println(baseNumber);
            }
        };

        //람다
        IntConsumer printInt = (i) ->{
            System.out.println(i + baseNumber);;
            //main 메서드와 scope를 같이 가지기 때문에 i를 baseNumber로 바꾸게 되면 already defined 컴파일 에러.


            //      effective final
            //만약 main 메서드의 baseNumber가 effective final이 아닐 경우, 예를 들어 baseNumber++ 있는 경우에는 printInt 내의 baseNumber는
            //main 메서드의 baseNumber를 참조하지 못하게 된다.
        };

        new LocalClass().printBaseNumber();

        integerConsumer.accept(99); //99

        printInt.accept(0); //10

    }

}
