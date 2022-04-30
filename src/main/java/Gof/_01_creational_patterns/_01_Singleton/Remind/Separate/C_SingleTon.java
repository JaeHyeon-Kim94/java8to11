package Gof._01_creational_patterns._01_Singleton.Remind.Separate;

public class C_SingleTon {
    private static final C_SingleTon INSTANCE = new C_SingleTon();

    public static C_SingleTon getInstance(){return INSTANCE;}
}
