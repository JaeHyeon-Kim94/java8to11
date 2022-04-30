package Gof._01_creational_patterns._01_Singleton.Remind.Separate;

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

