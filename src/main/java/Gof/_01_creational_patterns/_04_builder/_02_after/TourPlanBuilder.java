package Gof._01_creational_patterns._04_builder._02_after;

import java.time.LocalDate;

public interface TourPlanBuilder {
    //TourPlanBuilder를 통해 builder 타입의 인스턴스를 받아 method chain..
    TourPlanBuilder title(String title);
    //title 메서드를 통해 builder 받아 nightAndDays 다시 연달아 호출가능
    TourPlanBuilder nightAndDays(int nights, int days);

    TourPlanBuilder startDate(LocalDate localDate);

    TourPlanBuilder whereToStay(String whereToStay);

    TourPlanBuilder addPlan(int day, String plan);

    //언젠가 TourPlan을 리턴할 때까지 계속해서 이어나갈 수 있음.
    // cf. Stream

    TourPlan getPlan();

    //builder pattern을 이용하면 연쇄적인 메서드 호출뿐만 아니라
    //해당 인스턴스가 혹시 불완전한 상태는 아닌지 확인할 수 있음.


    //DefaultTourBuilder, TourDirector 학습 후 =========================================================================

    //장점

    //단순한 객체의 인스턴스를 생성하는게 아니라 복잡한 객체의 인스턴스의 경우에는
    //다른 builder에서 제공하는 메서드를 사용해야 하게끔 순서를 강제할 수도 있음
    //Client Code에서는 자연스럽게 따라갈 수밖에 없게끔.
    //이러한 순서를 이용해 값을 검증하기 편하게끔 설계할 수도 있음.(불완전한 객체 검증 편의성)

    //또한 director를 통해 concrete object를 만드는 과정을 숨길 수도 있음

    //director에서 tourbuilder가 달라진다면 동일한 프로세스는 거치겠지만 추가적, 세부적인 플랜이 추가될 수도 있음.
    //어떤 인스턴스가 나올지는 builder에 따라 달라질 수 있음. (확장성)


    //단점
    //TourPlan을 만들때 director와 builder class를 먼저 만들어야 한다.
    //대부분의 디자인패턴의 단점인데 구조가 좀 더 복잡해짐.

}
