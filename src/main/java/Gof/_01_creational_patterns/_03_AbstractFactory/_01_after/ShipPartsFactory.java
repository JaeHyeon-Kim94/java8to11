package Gof._01_creational_patterns._03_AbstractFactory._01_after;

public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();
}
