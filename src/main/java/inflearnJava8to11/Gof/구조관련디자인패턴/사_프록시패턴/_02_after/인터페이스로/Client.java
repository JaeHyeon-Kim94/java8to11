package Gof.구조관련디자인패턴.사_프록시패턴._02_after.인터페이스로;

public class Client {

    public static void main(String[] args) {
        GameService gameService = new GameServiceProxy();
        gameService.startGame();
    }
}
