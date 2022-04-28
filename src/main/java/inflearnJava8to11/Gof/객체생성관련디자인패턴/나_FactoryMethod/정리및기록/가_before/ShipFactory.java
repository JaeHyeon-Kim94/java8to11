package Gof.객체생성관련디자인패턴.나_FactoryMethod.정리및기록.가_before;

public class ShipFactory {

    public static Ship orderShip(String name, String email) {
        // validate
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
        /*
        요구사항의 변화에 따라 조건문으로 분기처리를 해야 하는 경우도 있고,
        배의 속성이 바뀔 때에는 도메인 클래스의 직접적인 변경이 필요한 경우도 있다.
        변경에 닫혀있지 않다. (Open/Closed principle 이라는 객체지향 원칙에 반함)
                            (확장에는 열려있고 변경에는 닫혀있어야 한다.)

        이 코드에서 변경에는 닫혀있고, 확장에는 열려있는 코드로 바꿀 것. How?
        */

        prepareFor(name);

        Ship ship = new Ship();
        ship.setName(name);

        // Customizing for specific name
        if (name.equalsIgnoreCase("whiteship")) {
            ship.setLogo("\uD83D\uDEE5️");
        } else if (name.equalsIgnoreCase("blackship")) {
            ship.setLogo("⚓");
        }

        // coloring
        if (name.equalsIgnoreCase("whiteship")) {
            ship.setColor("whiteship");
        } else if (name.equalsIgnoreCase("blackship")) {
            ship.setColor("black");
        }

        // notify
        sendEmailTo(email, ship);

        return ship;
    }

    private static void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

    private static void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }

}
