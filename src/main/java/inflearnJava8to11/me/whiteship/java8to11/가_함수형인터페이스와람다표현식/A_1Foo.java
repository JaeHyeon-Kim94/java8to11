package me.whiteship.java8to11.가_함수형인터페이스와람다표현식;

//함수형 인터페이스 : 추상 메서드가 단 하나 존재하는 인터페이스로,
//@FunctionalInterface 어노테이션을 가지고 있음. 없어도 되지만 검증을 위해.
public class A_1Foo {
    public static void main(String[] args) {

        //익명 내부 클래스 anonymous inner class
        A_1RunSomething runSomething = new A_1RunSomething() {
            @Override
            public void doIt() {
                System.out.println("Hello Anonymous");
            }
        };

        /*
        *람다 표현식
        *함수형 인터페이스의 인스턴스를 만드는 방법으로 쓰일 수 있다.
        *함수는 메소드 매개변수, 리턴 타입, 변수로 만들어 사용할 수 있음.
        *자바에서는 함수가 특수한 형태의 오브젝트일 뿐이고, 오브젝트는 자바에서 매개변수, 리턴 타입, 변수로 사용 가능.
        */

        A_1RunSomething runSomething1 = () -> System.out.println("Hello Lambda");

        runSomething.doIt();    //result : Hello Anonymous

        runSomething1.doIt();   //result : Hello Lambda


        /*
        * 함수형 프로그래밍의 특징
        * 1. Pure function
        *   - 사이드 이펙트가 없다.(함수 밖에 있는 값을 변경하지 않음.)
        *   - 상태가 없다.(함수 밖에 있는 값을 사용하지 않는다.)
        *
        * 2. 고차 함수(Higher-Order Function)
        *   - 함수가 함수를 매개변수로 받을 수도 있고 함수를 리턴할 수도 있다.
        *
        * 3. 불변성
        * */

        int baseNumber1 = 10;

        A_1RunSomething runSomething2 = new A_1RunSomething() {

            int baseNumber2 = 20;

            @Override
            public void doIt() {
//              baseNumber1++;              (함수 밖에 있는 값을 변경함)
//              return 5 + baseNumber2;     (함수 밖에 있는 값을 사용함)

                //baseNumber는 '사실상 final'이라고 간주.
            }
        };

    }
}
