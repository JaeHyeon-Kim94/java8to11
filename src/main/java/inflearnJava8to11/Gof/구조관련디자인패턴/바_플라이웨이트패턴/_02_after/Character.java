package Gof.구조관련디자인패턴.바_플라이웨이트패턴._02_after;

public class Character {

    //extrinsit한 데이터
    private char value;
    String color;
    //flyweight
    Font font;

    public Character(char value, String color, Font font) {
        this.value = value;
        this.color = color;
        this.font = font;
    }
}
