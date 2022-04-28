package Gof.구조관련디자인패턴.사_프록시패턴._02_after.인터페이스로;

public class DefaultGameService implements GameService {

    @Override
    public void startGame() {
        System.out.println("이 자리에 오신 여러분을 진심으로 환영합니다.");
    }
}
