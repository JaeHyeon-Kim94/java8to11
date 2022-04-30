package Gof._01_creational_patterns._03_AbstractFactory._01_after;

public class WhiteShipPartsProFactory implements ShipPartsFactory {

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchorPro();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheelPro();
    }
}
