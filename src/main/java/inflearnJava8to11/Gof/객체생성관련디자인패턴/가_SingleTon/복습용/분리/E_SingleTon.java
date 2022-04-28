package Gof.객체생성관련디자인패턴.가_SingleTon.복습용.분리;

import java.io.Serializable;
                            //G_App의 직렬화, 역직렬화 위해
public class E_SingleTon implements Serializable {

    private static class E_SingleTonHolder{
        private static final E_SingleTon INSTANCE = new E_SingleTon();
    }

    public static E_SingleTon getInstance(){ return E_SingleTonHolder.INSTANCE; }
}
