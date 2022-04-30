package Gof._01_creational_patterns._04_builder._02_after;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        TourPlanBuilder builder = new DefaultTourBuilder();
        TourPlan plan = builder.title("칸쿤 여행")
                .nightAndDays(2, 3)
                .startDate(LocalDate.of(2022, 3, 31))
                .whereToStay("리조트")
                .addPlan(0, "체크인하고 짐 풀기")
                .addPlan(0, "저녁 식사")
                .getPlan();

        TourPlan longBeachTrip = builder.title("롱비치")
                .startDate(LocalDate.of(2023, 3, 31))
                .getPlan();

        //before use TourDirector
        //만약 plan이라는 인스턴스가 자주 사용되는 인스턴스라고 하면 director에 넣어놓고 사용
        //after use TourDirector
        TourDirector tourDirector = new TourDirector(new DefaultTourBuilder());
        TourPlan planByDirector =  tourDirector.cancunTrip();
        TourPlan longBeachTripByDirector = tourDirector.longBeachTrip();
    }
}
