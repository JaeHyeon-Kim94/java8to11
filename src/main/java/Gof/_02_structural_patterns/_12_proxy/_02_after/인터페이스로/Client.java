package Gof._02_structural_patterns._12_proxy._02_after.인터페이스로;

public class Client {

    public static void main(String[] args) {
        GameService gameService = new GameServiceProxy();
        gameService.startGame();
    }
}
