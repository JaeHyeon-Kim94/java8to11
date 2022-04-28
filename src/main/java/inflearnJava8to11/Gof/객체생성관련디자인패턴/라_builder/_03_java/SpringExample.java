package Gof.객체생성관련디자인패턴.라_builder._03_java;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class SpringExample {
    public static void main(String[] args) {
        UriComponents howToStudyJava = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("www.whiteship.me")
                .path("java-playlist-ep1")
                .build().encode();

        System.out.println(howToStudyJava);

        //UriComponents를 builder를 통해 만듬
        //그냥 문자로 만드는 것보다 더 안전하게 만들 수 있음.


        //UriComponentsBuilder의 경우 형식이 좀 다른데
        //TourPlan의 필드들을 DefaultTourBuilder에서 중복으로 가지고 있었는데,
        //이를 보완한 방법.
        //TourPlanBuilder에 TourPlanBuilder를 리턴하는 newInstance() 메서드를 선언하고
        //DefaultTourBuilder에서 이를 구현
        /*

        private TourPlan tourPlan;     //=> 필드에는 TourPlan만 선언해두고

        public TourPlanBuilder newInstance(){
            this.tourPlan = new TourPlan(); //인스턴스를 생성후
            return this;
        }
        그리고 TourBuilder를 리턴하는 defaultbuilder의 메서드들에서

        this.days = days;
        return this;

        이런식이 아니라

        this.tourPlan.setNights(nights);
        this.tourPlan.setDays(days);
        return this;

        이런식으로
        */
    }
}
