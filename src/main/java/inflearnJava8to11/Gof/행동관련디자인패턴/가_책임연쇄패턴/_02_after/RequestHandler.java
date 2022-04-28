package Gof.행동관련디자인패턴.가_책임연쇄패턴._02_after;

public abstract class RequestHandler {

    private RequestHandler nextHandler;

    public RequestHandler(RequestHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    public void handle(Request request){
        if(nextHandler != null){
            nextHandler.handle(request);
        }
    }

}
