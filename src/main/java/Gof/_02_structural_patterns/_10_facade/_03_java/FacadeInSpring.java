package Gof._02_structural_patterns._10_facade._03_java;

import org.springframework.mail.MailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class FacadeInSpring {
    public static void main(String[] args) {
        //Bridge패턴일 수도, 퍼사드 패턴일 수도
        //java의 mail과 관련된 기능을 전부 JavaMailSenderImpl 안에 감추어 놓았음.
        MailSender mailSender = new JavaMailSenderImpl();

        //hibernate, jpa 등 어떤 API를 사용하는 지는 PlatformTransactionManager 뒤로 감추고
        //PlatformTransactionManager를 사용하는 Client 클래스는 비종속적인 관계 형성
   //  PlatformTransactionManager platformTransactionManager = new JdbcTransactionManager();
    }
}
