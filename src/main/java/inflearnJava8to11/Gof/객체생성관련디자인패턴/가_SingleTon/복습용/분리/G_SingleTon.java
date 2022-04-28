package Gof.객체생성관련디자인패턴.가_SingleTon.복습용.분리;

import java.io.IOException;
import java.io.Serializable;

public class G_SingleTon implements Serializable {

    G_SingleTon instance;

    protected Object readResolve() throws IOException{
         if(instance == null){
            synchronized (G_SingleTon.class){
                instance = new G_SingleTon();
            }
        }
        return instance;
    }

}
