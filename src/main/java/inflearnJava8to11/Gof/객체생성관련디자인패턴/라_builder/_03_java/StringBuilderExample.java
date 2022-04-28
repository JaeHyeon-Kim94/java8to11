package Gof.객체생성관련디자인패턴.라_builder._03_java;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String result = stringBuilder.append("whiteship").append("jaehyeon").toString();
        System.out.println(result);
        //StringBuilder(Synchronized 사용X) / StringBuffer(Synchronized 사용O)
    }
}
