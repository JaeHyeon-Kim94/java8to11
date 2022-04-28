package Gof.객체생성관련디자인패턴.라_builder._01_before;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        TourPlan shorttrip = new TourPlan();
        shorttrip.setTitle("오레곤 롱비치 여행");
        shorttrip.setStartDate(LocalDate.of(2021, 7, 15));
        shorttrip.setDays(0);
        shorttrip.setNights(0);
        /*
        일관된 프로세스가 없다.

        days나 nights나 연관성 있는 것이므로 같이 세팅하도록 강제하고 싶지만 그러지 못함.
        인스턴스가 불완전한 상태로 만들어질 수도 있음.
        다양한 파라미터를 지원하는 생성자를 만들고 싶을때, 생성자가 굉장히 장황해짐.

        빌더에 인스턴스를 만드는 방법들을 Step별로 인터페이스에 정의하고 그 구현체를 만든다.

        Client가 builder와 concrete builder를 직접 사용하는 것이 아니라 director를 통해 builder를 사용하면
        director안에 반복되는 builder 호출 스택을 안에 감춰놓고 간단하게 사용할 수 있다.
        */

        TourPlan tourPlan = new TourPlan();
        tourPlan.setTitle("칸쿤 여행");
        tourPlan.setNights(2);
        tourPlan.setDays(3);
        tourPlan.setStartDate(LocalDate.of(2020, 12, 9));
        tourPlan.setWhereToStay("리조트");
        tourPlan.addPlan(0, "체크인 이후 짐풀기");
        tourPlan.addPlan(0, "저녁 식사");
        tourPlan.addPlan(1, "조식 부페에서 식사");
        tourPlan.addPlan(1, "해변가 산책");
        tourPlan.addPlan(1, "점심은 수영장 근처 음식점에서 먹기");
        tourPlan.addPlan(1, "리조트 수영장에서 놀기");
        tourPlan.addPlan(1, "저녁은 BBQ 식당에서 스테이크");
        tourPlan.addPlan(2, "조식 부페에서 식사");
        tourPlan.addPlan(2, "체크아웃");


    }
}
