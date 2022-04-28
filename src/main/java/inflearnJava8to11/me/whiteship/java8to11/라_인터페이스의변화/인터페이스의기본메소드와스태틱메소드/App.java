package me.whiteship.java8to11.라_인터페이스의변화.인터페이스의기본메소드와스태틱메소드;

public class App {
    public static void main(String[] args) {
        Foo foo = new FooImpl("JaeHyeon");
        foo.printName();
        foo.printNameUpperCase();
    }
}
