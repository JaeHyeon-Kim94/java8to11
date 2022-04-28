package Gof.구조관련디자인패턴.사_프록시패턴._02_after.인터페이스없이;

public class Client {
    public static void main(String[] args) {
        GameServiceProxy gameServiceProxy = new GameServiceProxy();
        gameServiceProxy.startGame();
    }

}
