package Gof._01_creational_patterns._01_Singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingleTon implements Serializable {
    /*
    * 두 가지 목적
    * 1. 인스턴스를 오직 한 개만 제공(오로지 한 개의 인스턴스만 존재해야 하는 경우)
    * 2. 만들어진 하나의 인스턴스에 Global하게 접근 가능하도록
    * */


    //(1)
    //new를 사용한 인스턴스 생성은 싱글톤 패턴 충족시키지 못한다.
    private SingleTon() {}
    //생성자를 private으로 선언하면 외부에서 생성자를 호출할 수 없음.

    public static SingleTon getInstance1() {
        return new SingleTon();
        //이러면 또 new를 사용하게 된다. 여러번 호출시 매번 같은 인스턴스가 나와야 하는데, 매번 달라지게 됨.
    }

    //(2)
    private static volatile SingleTon instance;  //field

    public static SingleTon getInstance2(){
        if(instance == null){
            instance = new SingleTon();
        }
        return instance;
    }

    /*
    이 방법의 경우도 thread safe하지 못하다는 문제가 있다.
    한 쓰레드가 null 체크 조건문에 접근하여 SingleTon 인스턴스를 생성하려 하는 순간 다른 쓰레드가 접근하여 조건문에 들어왔을 수 있음.
    그럼 각 쓰레드가 같이 인스턴스를 생성할 것이고, SingleTon 패턴을 만족시키지 못함.
    How?
    (가) : syncronized 키워드 사용하기
       - 단점 : 동기화작업을 위한 처리때문에 성능에 있어서 불이익이 있을 수 있다는 단점이 있음.
    */

    public static synchronized SingleTon getInstance3(){
        if(instance == null){
            instance = new SingleTon();
        }
        return instance;
    }


    /*
    (나) : 이른 초기화 사용하기
    private static final SingleTon INSTANCE = new SingleTon();
       - 단점 : 인스턴스를 만드는 과정이 리소스를 많이 사용하는데, 해당 인스턴스를 잘 쓰지 않는 경우에는 비효율적일 수 있음.
    */
    private static final SingleTon INSTANCE = new SingleTon();

    public static SingleTon getInstance4(){
        return INSTANCE;
    }


    /*
    (다) : double checked locking 사용하기

    instance가 null일때만 synchronized에 걸리기 때문에 부하 문제에 있어서 (가)방법보다 장점이 있으며
    (나) 방법의 필요한 시점에 인스턴스를 만들지 못한다는 단점을 보완할 수 있다.

    instance라는 이름의 필드에 volatile이라는 키워드를 적어주어야 double checked locking 완성된다.

        - 단점 : 우선 복잡하고,
                volatile을 이해하기 위해서는 멀티쓰레드환경에서 메모리를 다루는 방법에 대한 이해가 필요하다,
                1.5부터 지원한다.
    */
    public static SingleTon getInstance5(){
        if(instance == null){
            synchronized ((SingleTon.class)) {  //조건문을 synchronized block으로 감싸 이미 쓰레드가 진입한 경우에는
                instance = new SingleTon();
            }
        }
        return instance;
    }


    /*
    >>>권장하는 방법 중의 하나
    (라) : static inner 클래스 사용하기
     getInstance6()이 호출될 때 SingleTonHolder 클래스가 로드되기때문에 lazy하고, 멀티쓰레드 환경에서도 안전
    */

    private static class SingleTonHolder{
        private static final SingleTon INSTANCE = new SingleTon();
    }

    public static SingleTon getInstance6(){
        return SingleTonHolder.INSTANCE;
    }






    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
         /*
            but 위의 코드를 뚫고 SingleTon 객체의 서로 다른 인스턴스를 생성할 수 있는 방법이 있음.

            첫 번째, 리플렉션 사용하기
        */
        SingleTon instance1 = SingleTon.getInstance6();

        Constructor<SingleTon> constructor = SingleTon.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingleTon instance2 = constructor.newInstance();        //new를 이용해 인스턴스를 생성한 것과 비슷하다고 보면 됨.

        System.out.println(instance1 == instance2); //false



        /*
            두 번째, 직렬화와 역직렬화 사용하기.
            Serializable 인터페이스 구현체에 한함.

            object를 file형태로 디스크에 저장(직렬화)했다가 다시 읽어들이는(역직렬화)
            즉, SingleTon객체를 file형태로 저장했다가 다시 읽어들인다.
        */
        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("SingleTon.obj"))){
            out.writeObject(getInstance5()); //직렬화되어 file로 write
        }

        SingleTon instance3 = null;

        try(ObjectInput in = new ObjectInputStream(new FileInputStream("SingleTon.obj"))){
            instance3 = (SingleTon) in.readObject();
        }

        System.out.println(getInstance5() == instance3);    //false

    }

    /*
        리플렉션 대응 방안

        enum을 사용하면 리플렉션으로 뚫을 수 없음.
        SingleTon.class.getDeclaredConstructor() 사용 불가하기 때문
        IllegalArgumentException : Cannot reflectively create enum objects


        enum은 Serializable 구현체인 Enum을 상속받음.
        또한 역직렬화의 경우에도 동일한 인스턴스가 생성되도록 할 수 있음.


            - 단점 : enum은 클래스를 로딩하는 순간 인스턴스를 만들기 때문에 (나)의 단점과 동일.
                    또한 상속을 사용하지 못한다. 즉, enum만을 상속받을 수 있고 다른 클래스를 상속받아야 한다면 folder를 사용해야함.

    */

//        public enum SingleTon{
//            INSTANCE;
//            SingleTon(){}
//        }
//          SingleTon instance = SingleTon.INSTANCE;



    /*
        역직렬화 대응 방안

        시그니처에 Serializable을 가지고 있으면 readResolve() 메서드 호출한다.
    */
    protected Object readResolve() throws IOException {
        return getInstance1();
    }





}
