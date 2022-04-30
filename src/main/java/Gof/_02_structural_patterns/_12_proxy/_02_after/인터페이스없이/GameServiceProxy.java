package Gof._02_structural_patterns._12_proxy._02_after.인터페이스없이;

import Gof._02_structural_patterns._12_proxy._01_before.GameService;
//
public class GameServiceProxy extends GameService {

    @Override
    public void startGame() {
        long before = System.currentTimeMillis();
        super.startGame();
        System.out.println(System.currentTimeMillis() - before);
    }
}
