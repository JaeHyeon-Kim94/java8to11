package Gof._02_structural_patterns._11_flyweight._02_after;

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
