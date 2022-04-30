package Gof._01_creational_patterns._01_Singleton.Remind.Separate;

import java.io.*;

public class G_App {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        E_SingleTon instance1 = E_SingleTon.getInstance();

        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("E_SingleTon.obj"))){
            out.writeObject(E_SingleTon.getInstance());
        }

        E_SingleTon instance2 = null;

        try(ObjectInput in = new ObjectInputStream(new FileInputStream("E_SingleTon.obj"))){
            instance2 = (E_SingleTon) in.readObject();
        }

        System.out.println(instance1 == instance2); //false

    }
}
