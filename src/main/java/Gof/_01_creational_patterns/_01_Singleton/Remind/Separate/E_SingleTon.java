package Gof._01_creational_patterns._01_Singleton.Remind.Separate;

import java.io.Serializable;
                            //G_App의 직렬화, 역직렬화 위해
public class E_SingleTon implements Serializable {

    private static class E_SingleTonHolder{
        private static final E_SingleTon INSTANCE = new E_SingleTon();
    }

    public static E_SingleTon getInstance(){ return E_SingleTonHolder.INSTANCE; }
}
