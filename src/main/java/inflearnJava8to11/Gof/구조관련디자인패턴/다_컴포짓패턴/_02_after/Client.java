package Gof.구조관련디자인패턴.다_컴포짓패턴._02_after;

import Gof.구조관련디자인패턴.다_컴포짓패턴._02_after.Bag;
import Gof.구조관련디자인패턴.다_컴포짓패턴._02_after.Item;

public class Client {
    public static void main(String[] args) {
        Item doranBlade = new Item("도란검", 450);
        Item healPotion = new Item("체력 물약", 50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPotion);

        Client client = new Client();
        client.printPrice(doranBlade);
        client.printPrice(bag);

    }

    private void printPrice(Item item) {
        System.out.println(item.getPrice());
    }

    private void printPrice(Component component) {
        System.out.println(component.getPrice());
    }
    //Client는 구체적인 정보를 알 필요 없고, 가격을 어떻게 구할지는 Composite 객체가 알아서 하고,
    //가격 정보는 Leaf에 해당하는 Bag, Item 객체가 가지고 있음.
    //전체나 부분이나 동일하게 취급할 수 있는 트리구조 형성
}
