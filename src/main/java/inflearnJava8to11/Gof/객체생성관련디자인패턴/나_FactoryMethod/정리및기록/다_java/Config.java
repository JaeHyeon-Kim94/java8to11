package Gof.객체생성관련디자인패턴.나_FactoryMethod.정리및기록.다_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public String hello(){
        return "hello";
    }
}
