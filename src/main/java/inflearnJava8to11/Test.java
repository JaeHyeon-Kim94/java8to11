public class Test {

    interface A{
        void printABC();
        void printDEF();
    }

    abstract class B implements A {
        @Override
        public void printABC() {
            System.out.println("ABC");
        }
    }

    class C extends B{
        @Override
        public void printDEF() {
            System.out.println("DEF");
        }
    }

    public void print(A a){
        a.printABC();
        a.printDEF();
    }


     static class 가{
        public int 하 = 1;

        public void 가나다(){
            class 라마바{

            }
        }

        interface 한글{

        }

    }

    class 나 extends 가{
        public int 하 = 2;
    }

    public void printInt1(가 ㄱ){
        System.out.println(ㄱ.하);
    }

    public void printInt2(나 ㄱ){
        System.out.println(ㄱ.하);
    }
}
