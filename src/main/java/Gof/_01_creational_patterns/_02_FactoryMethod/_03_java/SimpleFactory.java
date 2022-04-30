package Gof._01_creational_patterns._02_FactoryMethod._03_java;

import Gof._01_creational_patterns._02_FactoryMethod._02_after.ship.BlackShip;
import Gof._01_creational_patterns._02_FactoryMethod._02_after.ship.WhiteShip;

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
