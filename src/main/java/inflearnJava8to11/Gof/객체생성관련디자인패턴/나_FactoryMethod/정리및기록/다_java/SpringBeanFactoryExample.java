package Gof.객체생성관련디자인패턴.나_FactoryMethod.정리및기록.다_java;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanFactoryExample {

    //BeanFactory : 스프링의 핵심적인 IoC 컨테이너 => 팩토리 메서드 디자인 패턴이 녹아져있다.
    public static void main(String[] args) {
        //Creator                   //Creator를 구현한 ConcreteCreator.
        BeanFactory xmlFactory = new ClassPathXmlApplicationContext("config.xml");
       //넘겨받는 concreteProduct        //Object 타입의 product를 넘겨준다.
        String hello                 = xmlFactory.getBean("hello", String.class);
        System.out.println(hello);

        BeanFactory javaFactory = new AnnotationConfigApplicationContext(Config.class);
        String hi = javaFactory.getBean("hello", String.class);
        System.out.println(hi);
    }
}
