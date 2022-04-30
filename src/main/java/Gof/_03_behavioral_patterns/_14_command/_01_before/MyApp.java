package Gof._03_behavioral_patterns._14_command._01_before;

public class MyApp {
    private Light light;

    public MyApp(Light light){
        this.light = light;
    }

    public void press(){
        light.on();
    }

    public static void main(String[] args) {
        MyApp myApp = new MyApp(new Light());
        myApp.press();
        myApp.press();
        myApp.press();
        myApp.press();
    }

}
