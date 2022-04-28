package Gof.객체생성관련디자인패턴.가_SingleTon.복습용.분리;

public class C_SingleTon {
    private static final C_SingleTon INSTANCE = new C_SingleTon();

    public static C_SingleTon getInstance(){return INSTANCE;}
}
