package DoItJava.Ch09_자바제어자1;

public class A {
    int a;
    static int b;

    static{
        //static field의 초기화는 클래스가 로딩되는 시점에 가장 먼저 실행되는 static initialize block 사용할 것.
        b = 5;
    }


    public static void main(String[] args) {
        //main() 함수에 static이 붙은 이유는 JVM이 인스턴스 생성하고 참조변수를 통해 main()을 호출하는 과정을 거치지 않고
        //바로 ~.main() 호출할 수 있도록 구성한 것.
    }
}
