package Gof.객체생성관련디자인패턴.나_FactoryMethod.정리및기록.나_after.client;

import Gof.객체생성관련디자인패턴.나_FactoryMethod.정리및기록.나_after.factory.BlackShipFactory;
import Gof.객체생성관련디자인패턴.나_FactoryMethod.정리및기록.나_after.factory.ShipFactory;
import Gof.객체생성관련디자인패턴.나_FactoryMethod.정리및기록.나_after.factory.WhiteShipFactory;
import Gof.객체생성관련디자인패턴.나_FactoryMethod.정리및기록.나_after.ship.Ship;

public class Client {

    public static void main(String[] args) {
        Ship whiteship = new WhiteShipFactory().orderShip("Whiteship", "jaehyeon@mail.com");
        System.out.println(whiteship);

        /*whiteship은 잘 나온다.
        관건은 blackship을 추가로 만들어야 할 때,
        Ship, ShipFactory, WhiteShip, WhiteShipFactory 이것들이 전혀 바뀌지 않고
        blackship을 만들 수 있어야 한다.
        */

        Ship blackship = new BlackShipFactory().orderShip("Blackship", "jaehyeon@mail.com");
        System.out.println(blackship);

        /*
        ShipFactory 구현체 BlackShipFactory 생성,
        Ship 자손클래스 BlackShip만을 추가하여 요구사항 반영.

        여기서 인터페이스 기반 구체적인 클래스는 의존성 주입을 통해 해결하는 방법 추가.
        */
        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteship", "jaehyeon@mail.com");
        client.print(new BlackShipFactory(), "blackship", "jaehyeon@mail.com");
    }   //print()에서 사용할 의존성을 메서드 파라미터를 통해서 주입한다.

    private void print(ShipFactory shipFactory, String name, String email){
        System.out.println(shipFactory.orderShip(name, email));
    }


}
