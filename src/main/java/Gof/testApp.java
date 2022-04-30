package Gof;

public class testApp {
    public static void main(String[] args) {
        Test t = new Test();
        Test.C c = t.new C();

        t.print(c);


        t.printInt1(t.new 나());
        t.printInt2(t.new 나());
    }
}
