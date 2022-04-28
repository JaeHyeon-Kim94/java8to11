package Gof.객체생성관련디자인패턴.라_builder._02_after;

import java.time.LocalDate;

public class TourDirector {
    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder){
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan cancunTrip(){
        return tourPlanBuilder.title("칸쿤 여행")
                .nightAndDays(2, 3)
                .startDate(LocalDate.of(2022, 3, 31))
                .whereToStay("리조트")
                .addPlan(0, "체크인하고 짐 풀기")
                .addPlan(0, "저녁 식사")
                .getPlan();
    }

    public TourPlan longBeachTrip(){
        return tourPlanBuilder.title("롱비치")
                .startDate(LocalDate.of(2023, 3, 31))
                .getPlan();
    }
}
