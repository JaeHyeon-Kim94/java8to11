package Gof._02_structural_patterns._12_proxy._01_before;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        GameService gameService = new GameService();
        gameService.startGame();

        //GameService의 코드를 바꾸지 않고 GameService를 시작하고 끝낼때까지 시간이 얼마나 걸리는지 알고 싶을 때,
    }
}
