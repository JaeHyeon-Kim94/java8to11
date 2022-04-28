package Gof.객체생성관련디자인패턴.가_SingleTon.복습용.분리;

public class D_SingleTon {
    //CPU메모리 영역에 캐싱된 값이 아니라 항상 최신의 값을 가지도록 메인 메모리 영역에서 값을 참조하도록
    //출처: https://jronin.tistory.com/110
    private static volatile D_SingleTon instance;

    public static D_SingleTon getInstance(){
        if(instance == null){
            synchronized (D_SingleTon.class){
                instance = new D_SingleTon();
            }
        }
        return instance;
    }
}
