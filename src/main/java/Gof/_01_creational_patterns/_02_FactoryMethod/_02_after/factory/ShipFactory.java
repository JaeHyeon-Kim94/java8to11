package Gof._01_creational_patterns._02_FactoryMethod._02_after.factory;

import Gof._01_creational_patterns._02_FactoryMethod._02_after.ship.Ship;

public interface ShipFactory {

    default Ship orderShip(String name, String email){
        //로직을 한 눈에 이해하기 편함. 이전의 ShipFactory보다.
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email, ship);
        return ship;
    }

    public void sendEmailTo(String email, Ship ship);


    Ship createShip();
    
    private void validate(String name, String email){
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    }

    private static void prepareFor(String name) {
        System.out.println(name + "님 배를 만들 준비 중");
    }
}
