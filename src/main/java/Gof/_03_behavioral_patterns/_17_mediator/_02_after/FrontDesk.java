package Gof._03_behavioral_patterns._17_mediator._02_after;

import java.time.LocalDateTime;

public class FrontDesk {

    private CleaningService cleaningService = new CleaningService();

    private Restaurant restaurant = new Restaurant();


    //타월을 요청할때 누가 요청한 건지 알아야 하기 때문에 Guest의 정보가 필요하지만,
    //Guest를 통째로 넘기게 되면 CleaningService와 Coupling 문제가 다시 발생하기 때문에
    //해당 operation을 위해 필수적인 data만을 넘겨주도록 한다.

    //FrontDesk에서 의존성이 생기는건 문제가 되지 않음.
    public void getTowers(Guest guest, int numberOfTowers) {
        cleaningService.getTowers(guest.getId(), numberOfTowers);
    }

    public String getRoomNumberFor(Integer guestId) {
        return "1111";
    }

    public void dinner(Guest guest, LocalDateTime dateTime) {
        restaurant.dinner(guest.getId(), dateTime);
    }
}
