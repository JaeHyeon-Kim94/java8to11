package Gof.구조관련디자인패턴.바_플라이웨이트패턴._02_after;

public final class Font {
    final String family;
    final int size;

    //잘 변하지 않는 속성인 폰트와 사이즈만 빼냄
    //flyweight에 해당하는 인스턴스는 immutable해야함. 공유하는 객체이므로 다른 곳에서 변경되어선 안됨.
    //field와 class에 final


    public Font(String family, int size) {
        this.family = family;
        this.size = size;
    }

    public String getFamily() {
        return family;
    }

    public int getSize() {
        return size;
    }
}
