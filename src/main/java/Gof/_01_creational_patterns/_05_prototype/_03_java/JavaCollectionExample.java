package Gof._01_creational_patterns._05_prototype._03_java;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {
    public static void main(String[] args) {
        Student jaehyeon = new Student("jaehyeon");
        Student whiteship = new Student("whiteship");
        ArrayList<Student> students = new ArrayList<>();
        students.add(jaehyeon);
        students.add(whiteship);

        ArrayList<Student> clone = (ArrayList<Student>) students.clone();   //ArrayList의 clone() 이용
        //but 자주 쓰이지 않음.
        //주로 ArrayList가 아니라 List 타입으로 선언하고 다형적으로 대입하는데
        //List에서는 clone()을 지원하지 않음. ArrayList는 Clonable을 상속받지만 List는 X

        //방법 1
        List<Student> clone2 = new ArrayList<>(students);   //따지자면 프로토타입 패턴은 아님
                                                            //새로운 컬렉션 복사하고 싶을때 자주 사용되는 방법

    }
}
