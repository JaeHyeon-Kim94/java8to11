package Gof.객체생성관련디자인패턴.라_builder._02_after;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DefaultTourBuilder implements TourPlanBuilder {

    //TourPlan에 있는 모든 field들 정의
    private String title;

    private int nights;

    private int days;

    private LocalDate startDate;

    private String whereToStay;

    private List<DetailPlan> plans;

    @Override
    public TourPlanBuilder title(String title) {
        this.title = title;
        //TourPlanBuilder 타입인 DefaultTourBuilder의 인스턴스가 리턴되고,
        //계속 그 인스턴스를 사용할 수 있음
        return this;
    }

    @Override
    public TourPlanBuilder nightAndDays(int nights, int days) {
        this.nights=nights;
        this.days=days;
        return this;
    }

    @Override
    public TourPlanBuilder startDate(LocalDate localDate) {
        this.startDate=localDate;
        return this;
    }

    @Override
    public TourPlanBuilder whereToStay(String whereToStay) {
        this.whereToStay=whereToStay;
        return this;
    }

    @Override
    public TourPlanBuilder addPlan(int day, String plan) {
        if(this.plans==null)    this.plans = new ArrayList<>();
        this.plans.add(new DetailPlan(day, plan));
        return this;
    }

    @Override
    public TourPlan getPlan() {
        return new TourPlan(title, nights, days, startDate, whereToStay, plans);
    }
}
