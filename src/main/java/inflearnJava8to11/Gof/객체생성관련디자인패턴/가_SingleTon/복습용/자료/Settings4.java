package Gof.객체생성관련디자인패턴.가_SingleTon.복습용.자료;

/**
 * static inner 클래스 홀더
 */
public class Settings4 {

    private Settings4() { }

    private static class Settings4Holder {
        private static final Settings4 INSTANCE = new Settings4();
    }

    public static Settings4 getInstance() {
        return Settings4Holder.INSTANCE;
    }

}
