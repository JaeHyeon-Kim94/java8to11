package Gof.객체생성관련디자인패턴.나_FactoryMethod.정리및기록.다_java;

import Gof.객체생성관련디자인패턴.나_FactoryMethod.정리및기록.나_after.ship.BlackShip;
import Gof.객체생성관련디자인패턴.나_FactoryMethod.정리및기록.나_after.ship.WhiteShip;

public class SimpleFactory {
    public Object createProduct(String name){
        if(name.equals("whiteship")){
            return new WhiteShip();
        }else if(name.equals("blackship")){
            return new BlackShip();
        }
        //하나의 구현체에서 여러 구체적인 product 생성
        throw new IllegalArgumentException();
    }
}
