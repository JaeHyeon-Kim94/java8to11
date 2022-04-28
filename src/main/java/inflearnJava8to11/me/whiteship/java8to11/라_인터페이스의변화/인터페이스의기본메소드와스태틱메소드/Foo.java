package me.whiteship.java8to11.라_인터페이스의변화.인터페이스의기본메소드와스태틱메소드;

public interface Foo {

    void printName();

    /*
    이 챕터는 딱히 볼거없음...

    구현이 강제되는 걸 피하고 싶다면 default와 static 메서드를 인터페이스에 구현할 수 있고, diamond problem을 조심해야한다,
    default, static 메서드는 자식이 다시 재정의할 수 있지만 Object의 기본제공 메서드는 재정의할 수 없다 정도.
==============================================================================================================================

    *이 인터페이스 구현체들에게 특정 기능을 제공하고싶다면,
    * 추상메서드를 정의하는 방법이 있긴 하지만 모든 구현체들이 이를 구현해야 하는 문제 존재.
    * 추상메서드 말고 default 혹은 static 메서드를 이용할 수 있음
     */

    /*
    *
    * 디폴트메서드는 자식 클래스 혹은 인터페이스에서 재정의할 수 있다. 다만 Object의 메서드(equals, hashcode, toString)는 재정의할 수 없음.
    * 다만 추상메서드로 선언하는 것은 가능.
    * 본인이 수정할 수 있는 인터페이스만 default 메서드 제공할 수 있음.
    *
    * 또한 한 클래스가 두 인터페이스를 구현하고 있는 경우, 두 인터페이스가 똑같은 디폴트메서드를 가지고 있다면 컴파일에러.
    * */

    default void printNameUpperCase(){
        System.out.println(getName().toUpperCase());
    }

    String getName();
}
