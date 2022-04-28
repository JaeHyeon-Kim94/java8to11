package Gof.객체생성관련디자인패턴.나_FactoryMethod.정리및기록.나_after.factory;

import Gof.객체생성관련디자인패턴.나_FactoryMethod.정리및기록.나_after.ship.Ship;

public abstract class DefaultShipFactory implements ShipFactory{
    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getClass().getName() + " 다 만들었습니다.");
    }
}
