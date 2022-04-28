package Gof.구조관련디자인패턴.나_브릿지패턴._01_before;

public class KDAALLOUT아리 implements Champion {

    @Override
    public void move() {
        System.out.println("KDAALLOUT 아리 move");
    }

    @Override
    public void skillQ() {
        System.out.println("KDAALLOUT 아리 Q");
    }

    @Override
    public void skillW() {
        System.out.println("KDAALLOUT 아리 W");
    }

    @Override
    public void skillE() {
        System.out.println("KDAALLOUT 아리 E");
    }

    @Override
    public void skillR() {
        System.out.println("KDAALLOUT 아리 R");
    }

    //각각의 스킬들이 각각의 스킨에 따라 다양한 형태


    //여기서 새로운 스킨이 추가된다면, 스킨에 따른 클래스가 또 추가되어야 할 것.
    //하나의 계층구조로 다양한 특징들을 표현하기 위해
    //Child Class들을 만드는 과정에서 중복코드가 많아지고 반복작업이 늘어남. GO to App
}
