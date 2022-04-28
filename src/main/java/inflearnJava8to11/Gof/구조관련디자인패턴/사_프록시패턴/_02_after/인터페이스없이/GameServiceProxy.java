package Gof.구조관련디자인패턴.사_프록시패턴._02_after.인터페이스없이;

import Gof.구조관련디자인패턴.사_프록시패턴._01_before.GameService;
//
public class GameServiceProxy extends GameService {

    @Override
    public void startGame() {
        long before = System.currentTimeMillis();
        super.startGame();
        System.out.println(System.currentTimeMillis() - before);
    }
}
