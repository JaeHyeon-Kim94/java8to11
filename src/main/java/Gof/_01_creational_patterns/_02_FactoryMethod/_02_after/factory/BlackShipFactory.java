package Gof._01_creational_patterns._02_FactoryMethod._02_after.factory;

import Gof._01_creational_patterns._02_FactoryMethod._02_after.ship.BlackShip;
import Gof._01_creational_patterns._02_FactoryMethod._02_after.ship.Ship;

public class BlackShipFactory extends DefaultShipFactory{
    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
