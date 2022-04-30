package Gof._01_creational_patterns._04_builder._02_after;

import java.time.LocalDate;
import java.util.ArrayList;

public class DefaultTourBuilder2 implements TourPlanBuilder {

    TourPlan tourPlan = new TourPlan();

    @Override
    public TourPlanBuilder title(String title) {
        tourPlan.setTitle(title);

        return this;
    }

    @Override
    public TourPlanBuilder nightAndDays(int nights, int days) {
        tourPlan.setNights(nights);
        tourPlan.setDays(days);
        return this;
    }

    @Override
    public TourPlanBuilder startDate(LocalDate localDate) {
        tourPlan.setStartDate(localDate);
        return this;
    }

    @Override
    public TourPlanBuilder whereToStay(String whereToStay) {
        tourPlan.setWhereToStay(whereToStay);
        return this;
    }

    @Override
    public TourPlanBuilder addPlan(int day, String plan) {
        if(tourPlan.getPlans() == null) tourPlan.setPlans(new ArrayList<DetailPlan>());

        tourPlan.getPlans().add(new DetailPlan(day, plan));

        return this;
    }

    @Override
    public TourPlan getPlan() {
        return tourPlan;
    }
}
