package Gof.행동관련디자인패턴.가_책임연쇄패턴._01_before;

public class Client {

    public static void main(String[] args) {
        Request request = new Request("무궁화 꽃이 피었습니다.");
        RequestHandler requestHandler = new LoggingRequestHandler();
        requestHandler.handler(request);

        RequestHandler requestHandler2 = new AuthRequestHandler();
        requestHandler2.handler(request);

        //사용자가 사용해야 할 객체가 무엇인지 구체적으로 알아야 한다는 문제점.
        //기능 추가시 효율적, 효과적이지 못함.
    }
}
