package Gof.객체생성관련디자인패턴.라_builder._02_after;

public class App1 {
    public static void main(String[] args) {
        TourPlanBuilder builder = new DefaultTourBuilder2();
        TourDirector director = new TourDirector(builder);
        TourPlan tourPlan = director.cancunTrip();
        System.out.println(tourPlan);
    }
}
