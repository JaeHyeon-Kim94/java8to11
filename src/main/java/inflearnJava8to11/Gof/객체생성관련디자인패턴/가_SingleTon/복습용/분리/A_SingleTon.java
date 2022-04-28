package Gof.객체생성관련디자인패턴.가_SingleTon.복습용.분리;

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
