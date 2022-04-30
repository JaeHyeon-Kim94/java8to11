package Gof._01_creational_patterns._01_Singleton.Remind.Separate;

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
