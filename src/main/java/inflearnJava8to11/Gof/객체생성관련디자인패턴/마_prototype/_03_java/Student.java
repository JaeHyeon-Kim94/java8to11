package Gof.객체생성관련디자인패턴.마_prototype._03_java;

public class Student {
    String name;

    public Student(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
