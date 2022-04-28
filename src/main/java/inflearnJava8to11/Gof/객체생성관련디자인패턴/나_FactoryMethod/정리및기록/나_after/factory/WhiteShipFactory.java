package Gof.객체생성관련디자인패턴.나_FactoryMethod.정리및기록.나_after.factory;

import Gof.객체생성관련디자인패턴.나_FactoryMethod.정리및기록.나_after.ship.Ship;
import Gof.객체생성관련디자인패턴.나_FactoryMethod.정리및기록.나_after.ship.WhiteShip;

public class WhiteShipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
