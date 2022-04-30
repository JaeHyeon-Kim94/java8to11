package Gof._01_creational_patterns._01_Singleton.Remind.Separate;

public class A_SingleTon {

    //기초적인 싱글톤. thread safe하지 않음.
    private A_SingleTon(){}

    private static A_SingleTon instance;

    public static A_SingleTon getInstance(){
        if(instance == null){
            instance = new A_SingleTon();
        }
        return instance;
    }
}
