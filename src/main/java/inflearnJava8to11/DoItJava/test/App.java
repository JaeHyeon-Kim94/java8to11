package DoItJava.test;

import java.util.HashMap;

class a{
    String name;

    public a(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return this.name == ((a) obj).name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

class b {
    String name;

    public b(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.name == ((b) obj).name;
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

        HashMap<a, String> hm2 = new HashMap<>();
        hm2.put(new a("첫 번째"), "데이터1");
        hm2.put(new a("첫 번째"), "데이터2");
        hm2.put(new a("두 번째"), "데이터3");
        System.out.println(hm2);

        HashMap<b, String> hm3 = new HashMap<>();
        hm3.put(new b("첫 번째"), "데이터1");
        hm3.put(new b("첫 번째"), "데이터1");
        hm3.put(new b("두 번째"), "데이터1");
        System.out.println(hm3);


    }
}
