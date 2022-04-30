package Gof._02_structural_patterns._12_proxy._02_after.인터페이스없이;

public class Client {
    public static void main(String[] args) {
        GameServiceProxy gameServiceProxy = new GameServiceProxy();
        gameServiceProxy.startGame();
    }

}
