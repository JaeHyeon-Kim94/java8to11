package Gof._01_creational_patterns._01_Singleton.Remind.Separate;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class F_App {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        E_SingleTon instance1 = E_SingleTon.getInstance();

        Constructor<E_SingleTon> constructor1 = E_SingleTon.class.getDeclaredConstructor();
        constructor1.setAccessible(true);
        E_SingleTon instance2 = constructor1.newInstance();

        System.out.println(instance1 == instance2); //false

        //============================================리플렉션 방지====================================================

//        F_SingleTon instance3 = F_SingleTon.INSTANCE;
//
//        Constructor<F_SingleTon> constructor2 = F_SingleTon.class.getDeclaredConstructor(); //불가.
//        constructor2.setAccessible(true);
//        F_SingleTon instance4 = constructor2.newInstance();

    }
}
