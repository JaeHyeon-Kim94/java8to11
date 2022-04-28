package Gof.행동관련디자인패턴.가_책임연쇄패턴._01_before;

public class LoggingRequestHandler extends RequestHandler {

    @Override
    public void handler(Request request) {
        System.out.println("로깅");
        super.handler(request);
    }
}
