package Gof._02_structural_patterns._12_proxy._03_java;

import Gof._02_structural_patterns._12_proxy._02_after.인터페이스로.GameService;
import Gof._02_structural_patterns._12_proxy._02_after.인터페이스로.DefaultGameService;

import java.lang.reflect.Proxy;

public class ProxyInJava {

    public static void main(String[] args) {
        ProxyInJava proxyInJava = new ProxyInJava();
        proxyInJava.dynamicProxy();
    }

    private void dynamicProxy() {
        GameService gameServiceProxy = getGameServiceProxy(new DefaultGameService());
        gameServiceProxy.startGame();
    }
    //다이나믹 프록시
    //코드 실행중에 프록시 인스턴스를 동적으로 생성
    private GameService getGameServiceProxy(GameService target) {
                                                    //클래스로더
        return  (GameService) Proxy.newProxyInstance(this.getClass().getClassLoader(),
                                                        //동적으로 생성되는 프록시가 구현해야 하는 인터페이스 타입
                                                        new Class[]{GameService.class},
                                                        //invocaionHandler 타입의 인스턴스 필요
                                                        (proxy, method, args) -> {
                                                        /*동일한 코드
                                                        new InvocationHandler(){
                                                            @Override
                                                            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
                                                                System.out.println("Hello dynamic proxy");
                                                                method.invoke(target, args);
                                                                return null;
                                                            }
                                                        });
                                                        */
                    System.out.println("O");

                    //메서드 실행
                    //invoke를 호출할 때, 어떤 인스턴스(target)에 있는 메서드 실행할건지, 메서드 실행시 넘겨줄 파라미터(args) 제공
                    method.invoke(target, args);
                    System.out.println("ㅁ");
                    return null;
                });
    }
}
