package Gof._03_behavioral_patterns._14_command._02_after;

import Gof._03_behavioral_patterns._14_command._01_before.Light;

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        new LightOffCommand(new Light()).execute();
    }
}
