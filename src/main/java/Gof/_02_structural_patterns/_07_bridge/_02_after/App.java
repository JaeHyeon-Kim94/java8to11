package Gof._02_structural_patterns._07_bridge._02_after;

public class App {
    public static void main(String[] args) {
        Champion KDA아리 = new 아리(new KDA스킨());
        KDA아리.skillQ();
        KDA아리.skillW();

        Champion KDAALLOUT아리 = new 아리(new KDAALLOUT스킨());
        KDAALLOUT아리.skillQ();
        KDAALLOUT아리.skillW();


        //여기서 연산자 뒷부분을 주입받는 식으로 설계한다면
        //Client는 추상적인 계층구조만을 사용하고
        //Abstraction 계층구조에 해당하는 Champion이 Implementation Detail에 해당하는 Skin을 사용
        //각각의 Skin들은 Concrete Implementation에 해당
        //각각의 Champion들은 Refined Abstraction에 해당


    }
}
