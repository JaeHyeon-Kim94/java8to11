package Gof._02_structural_patterns._07_bridge._01_before;

public class KDA아리 implements Champion {
    @Override
    public void move() {
        System.out.println("KDA 아리 move");
    }

    @Override
    public void skillQ() {
        System.out.println("KDA 아리 Q");
    }

    @Override
    public void skillW() {
        System.out.println("KDA 아리 W");
    }

    @Override
    public void skillE() {
        System.out.println("KDA 아리 E");
    }

    @Override
    public void skillR() {
        System.out.println("KDA 아리 R");
    }


    //각각의 스킬들이 각각의 스킨에 따라 다양한 형태
}
