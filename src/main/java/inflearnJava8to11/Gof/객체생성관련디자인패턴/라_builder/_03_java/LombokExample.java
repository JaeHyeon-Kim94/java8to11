//package Gof.객체생성관련디자인패턴.라_builder._03_java;
//
//import lombok.Builder;
//
////++
////롬복에서 빌더 지원
////어떤 클래스를 작성했을 때 여러개의 필드가 있는 경우에 생성자 혹은 setter 만들기 번거롭고, 추가될 때 매번 수정해야 함.
////롬복의 @Builder를 class 상단에 선언하면 해당 클래스를 컴파일할 때 자동적으로 Builder 만들어짐
////ex
//@Builder        //컴파일시 annotation processor
// public class LombokExample{
//    private String title;
//    private int nights;
//    private int days;
//
//    public static void main(String[] args) {
//        LombokExample trip = LombokExample.builder()
//                .title("여행")
//                .nights(2)
//                .days(3)
//                .build();
//    }
//
//}
