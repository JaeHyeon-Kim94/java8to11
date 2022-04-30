package Gof._03_behavioral_patterns._14_command._02_after;

public interface Command {

    void execute();
    //execute를 선언하거나 Command가 아닌 Runnable 인터페이스 사용

    void undo();
}
