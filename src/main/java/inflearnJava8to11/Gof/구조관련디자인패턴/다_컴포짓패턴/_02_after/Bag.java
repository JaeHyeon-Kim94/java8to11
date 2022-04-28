package Gof.구조관련디자인패턴.다_컴포짓패턴._02_after;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Component{

    //Composite에서는 절대로 Leaf타입을 참조하면 안된다.
    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public List<Component> getComponents() {
        return components;
    }
    //이렇게 Component 타입으로 바꾸게 되면 가격을 구하는 로직이 클라이언트 쪽에서 이쪽으로 넘어옴
    //즉 가방에서 가격을 구하는 책임을 가지게 됨.
    @Override
    public int getPrice() {
        return components.stream().mapToInt(Component::getPrice).sum();
    }
}
