package Gof.구조관련디자인패턴.가_어댑터패턴._03_java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

public class AdapterInSpring {
    public static void main(String[] args) {
        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        HandlerAdapter handlerAdapter = new RequestMappingHandlerAdapter();



        //hello()는 Handler의 일종
        @org.springframework.stereotype.Controller
        class Controller{
            //@RequestMapping
            @GetMapping("/hello")
            public String hello(){return "hi";}

        }

        // 만이 Handler가 아니고, Spring에서는 다양한 형태의 Handler 지원
        //본인이 원하는 Handler를 만들어서 확장할 수 있음. 핸들러의 형태는 다양하다는게 중요.

        //DispatcherServlet의 doDispatch 메서드 읽어볼것.

        //핸들러 어댑터를 통해 핸들러 처리(핸들러는 다양한 타입일 수 있게 때문에 Object 타입 인자로 받음)
        //핸들러를 가지고 어떠한 요청을 처리.
        //핸들러가 어떻게 생겼는지에 따라 다른 핸들러 어댑터를 사용.
        //HandlerAdpater라는 어댑터용 인터페이스를 구현하여 각기 다른 핸들러 어댑터를 구현하여 핸들러를 처리
        //request, response, handler는 adaptee, ModelAndView는 target interface, HandlerAdapter는 adapter의 인터페이스
    }
}
