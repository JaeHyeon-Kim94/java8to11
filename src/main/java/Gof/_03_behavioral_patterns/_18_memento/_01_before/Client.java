package Gof._03_behavioral_patterns._18_memento._01_before;

public class Client {

    public static void main(String[] args) {
        Game game = new Game();
        game.setRedTeamScore(10);
        game.setBlueTeamScore(20);

        //Game 객체에 어떤 정보가 있는지를 구체적으로 아는 상태. not encapsulation.
        //Game의 정보가 바뀔 때, Client의 code도 변경되어야 함. 관계 의존성을 낮추기 위해 memento 패턴 적용
        int blueTeamScore = game.getBlueTeamScore();
        int redTeamScore = game.getRedTeamScore();

        Game restoredGame = new Game();
        restoredGame.setBlueTeamScore(blueTeamScore);
        restoredGame.setRedTeamScore(redTeamScore);
    }
}
