package DoItJava.Ch10_클래스상속과다형성;

import java.util.HashMap;

class A{
    String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return this.name == ((A) obj).name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

class B {
    String name;

    public B(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.name == ((B) obj).name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

public class App {
    public static void main(String[] args) {
        HashMap<Integer, String> hm1 = new HashMap<>();
        hm1.put(1, "데이터1");
        hm1.put(2, "데이터2");
        hm1.put(3, "데이터3");
        System.out.println(hm1);

        HashMap<A, String> hm2 = new HashMap<>();
        hm2.put(new A("첫 번째"), "데이터1");
        hm2.put(new A("첫 번째"), "데이터2");
        hm2.put(new A("두 번째"), "데이터3");
        System.out.println(hm2);

        HashMap<B, String> hm3 = new HashMap<>();
        hm3.put(new B("첫 번째"), "데이터1");
        hm3.put(new B("첫 번째"), "데이터1");
        hm3.put(new B("두 번째"), "데이터1");
        System.out.println(hm3);

        //HashMap.put시 key 비교는 내부적으로 hashCode 호출
        //equals() 와 함께 추가로 오버라이딩 해야한다.
    }
}
