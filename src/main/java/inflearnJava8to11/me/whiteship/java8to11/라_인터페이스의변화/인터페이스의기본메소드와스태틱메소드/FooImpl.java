package me.whiteship.java8to11.라_인터페이스의변화.인터페이스의기본메소드와스태틱메소드;

public class FooImpl implements Foo {

    String name;

    public FooImpl(String name){
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println(this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
