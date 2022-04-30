package Gof._01_creational_patterns._03_AbstractFactory._03_java;



import Gof._01_creational_patterns._02_FactoryMethod._02_after.ship.Ship;
import Gof._01_creational_patterns._02_FactoryMethod._02_after.ship.WhiteShip;
import org.springframework.beans.factory.FactoryBean;

public class ShipFactory implements FactoryBean<Ship> {

    @Override
    public Ship getObject() throws Exception {
        Ship ship = new WhiteShip();
        ship.setName("whiteship");
        return ship;
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }
}
