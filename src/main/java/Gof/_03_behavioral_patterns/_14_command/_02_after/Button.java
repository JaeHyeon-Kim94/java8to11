package Gof._03_behavioral_patterns._14_command._02_after;

import Gof._03_behavioral_patterns._14_command._01_before.Game;
import Gof._03_behavioral_patterns._14_command._01_before.Light;

import java.util.Stack;

public class Button {
    private Stack<Command> commands = new Stack<>();

    //command패턴을 적용하기 전에는 구체적인 객체의 메서드를 직접 호출해야 했지만
    //적용 후에는 command 인터페이스 구현체의 execute 메서드만 호출하면 됨.
    public void press(Command command){
        command.execute();
        commands.push(command);
    }

    public void undo(){
        if(!commands.isEmpty()){
            Command command = commands.pop();
            command.undo();
        }
    }

    public static void main(String[] args) {

        Button button = new Button();
        button.press(new LightOnCommand(new Light()));
        button.press(new LightOffCommand(new Light()));
        button.undo();
        button.undo();


    }
}
