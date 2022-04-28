package Gof.객체생성관련디자인패턴.다_AbstractFactory._01_after;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteShipFactory(new WhiteShipPartsFactory());
        Ship ship = shipFactory.orderShip("김재현", "김재현@이메일.com");
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());

        ShipFactory shipFactoryPro = new WhiteShipFactory(new WhiteShipPartsProFactory());
        Ship shipPro = shipFactoryPro.orderShip("김재현", "김재현@이메일.com");
        System.out.println(shipPro.getAnchor().getClass());
        System.out.println(shipPro.getWheel().getClass());
    }
}
