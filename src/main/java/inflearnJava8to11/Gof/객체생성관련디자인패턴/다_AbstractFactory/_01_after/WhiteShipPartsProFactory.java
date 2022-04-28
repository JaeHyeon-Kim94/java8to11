package Gof.객체생성관련디자인패턴.다_AbstractFactory._01_after;

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
