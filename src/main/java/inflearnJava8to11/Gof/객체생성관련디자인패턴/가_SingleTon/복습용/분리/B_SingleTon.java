package Gof.객체생성관련디자인패턴.가_SingleTon.복습용.분리;

public class B_SingleTon {
    private static B_SingleTon instance;

    //동기화처리 위한 부하문제
    public static synchronized B_SingleTon getInstance(){
        if(instance == null){
            instance = new B_SingleTon();
        }
        return instance;
    }


}

