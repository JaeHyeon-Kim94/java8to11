package Gof.객체생성관련디자인패턴.가_SingleTon.복습용.자료;

/**
 * double checked locking
 */
public class Settings3 {

    private static volatile Settings3 instance;

    private Settings3() { }

    public static Settings3 getInstance() {
        if (instance == null) {
            synchronized (Settings3.class) {
                if (instance == null) {
                    instance = new Settings3();
                }
            }
        }

        return instance;
    }

}
