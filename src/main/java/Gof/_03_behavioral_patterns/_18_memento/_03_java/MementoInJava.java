package Gof._03_behavioral_patterns._18_memento._03_java;



import Gof._03_behavioral_patterns._18_memento._02_after.Game;

import java.io.*;

public class MementoInJava {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO Serializable
        // 직렬화와 역직렬화를 하고 싶은 클래스에 Serializable을 구현해주어야 함.
        // 직렬화, 역직렬화 사용하기 전에 보안 및 성능 이슈 고려하여야 함. 학습 필요
        Game game = new Game();
        game.setRedTeamScore(10);
        game.setBlueTeamScore(20);

        // TODO 직렬화
        // 직렬화 : 객체를 byteStream으로 바꿔주는 것.
        // byteStream으로 저장하면 파일으로 저장하거나, 다른 곳으로 전송하거나 하는 일들이 가능.
        try(FileOutputStream fileOut = new FileOutputStream("GameSave.hex");
        ObjectOutputStream out = new ObjectOutputStream(fileOut))
        {
            out.writeObject(game);
        }

        game.setBlueTeamScore(25);
        game.setRedTeamScore(15);

        // TODO 역직렬화
        // byteStream으로 직렬화된 데이터를 복원하는 것
        try(FileInputStream fileIn = new FileInputStream("GameSave.hex");
            ObjectInputStream in = new ObjectInputStream(fileIn))
        {
            game = (Game) in.readObject();
            System.out.println(game.getBlueTeamScore());
            System.out.println(game.getRedTeamScore());
        }
    }
}
