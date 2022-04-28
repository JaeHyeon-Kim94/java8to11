package Gof.행동관련디자인패턴.가_책임연쇄패턴._01_before;

public class RequestHandler {

    public void handler(Request request) {
        System.out.println(request.getBody());
    }
}
