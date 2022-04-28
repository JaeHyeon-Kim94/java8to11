package Gof.객체생성관련디자인패턴.다_AbstractFactory._01_after;

abstract class DefaultShipFactory implements ShipFactory {

    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println(email + "님께 보내는 메일\n" + ship.getClass() + "다 만들었습니다.");
    }

//    public abstract Ship createShip();
}
