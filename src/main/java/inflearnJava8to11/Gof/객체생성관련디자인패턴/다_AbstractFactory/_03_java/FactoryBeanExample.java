package Gof.객체생성관련디자인패턴.다_AbstractFactory._03_java;



import Gof.객체생성관련디자인패턴.나_FactoryMethod.정리및기록.나_after.ship.Ship;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanExample {

    public static void main(String[] args) {
//        ApplicationContext applicationContextSpringXML = new ClassPathXmlApplicationContext("config.xml");
//        Ship whiteship = applicationContextSpringXML.getBean("whiteship", Ship.class);
//        System.out.println(whiteship.getName());


        //자바에서도 factorybean이 동작하긴 하지만 자바에선 큰 의미가 없음.
        ApplicationContext applicationContextJava = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);
        ShipFactory bean1 = applicationContextJava.getBean(ShipFactory.class);
        Ship bean2 = applicationContextJava.getBean(Ship.class);
        System.out.println(bean1);
        System.out.println(bean2);
    }
}
