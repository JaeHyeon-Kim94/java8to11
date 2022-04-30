package Gof._03_behavioral_patterns._14_command._03_java;

import Gof._03_behavioral_patterns._14_command._01_before.Game;
import Gof._03_behavioral_patterns._14_command._01_before.Light;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CommandInJava {
    public static void main(String[] args) {
        Light light = new Light();
        Game game = new Game();

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        //메서드레퍼런스
        executorService.submit(light::on);
        //익명내부클래스
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                light.on();
            }
        });
        //람다
        executorService.submit(()->light.on());

        executorService.submit(game::start);
        executorService.submit(game::end);
        executorService.submit(light::off);
        executorService.shutdown();
    }
}
