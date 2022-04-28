package Gof.행동관련디자인패턴.가_책임연쇄패턴._02_after;

public class Client {

    private RequestHandler requestHandler;

    public Client(RequestHandler requestHandler){
        this.requestHandler = requestHandler;
    }

    public void doWork(){
        Request request = new Request("Client doWork");
        requestHandler.handle(request);
    }

    public static void main(String[] args) {
        //요청을 보내는 쪽(Client의 doWork)과 요청을 처리하는 쪽(각 requestHandler)이 분리되어있다.
        RequestHandler chain = new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));
        Client client = new Client(chain);
        client.doWork();
    }

}
