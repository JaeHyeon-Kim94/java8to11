package Gof._01_creational_patterns._02_FactoryMethod._02_after.factory;

import Gof._01_creational_patterns._02_FactoryMethod._02_after.ship.Ship;

public abstract class DefaultShipFactory implements ShipFactory{
    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getClass().getName() + " 다 만들었습니다.");
    }
}
