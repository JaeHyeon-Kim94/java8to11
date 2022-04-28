package Gof.구조관련디자인패턴.가_어댑터패턴._03_java;

import java.io.*;
import java.util.*;

public class AdapterInJava {
    public static void main(String[] args) {

        //1. Collections


        //배열을 리스트로 바꿀때 사용하는 방법
        //가변인자(T... a) 즉, 배열을 넘겼지만 받는 것은 List라는 인터페이스
        List<String> strings = Arrays.asList("a", "b", "c");


        //넘겨준 것은 List라는 인터페이스이지만 받은 것은 Enumeration이라는 인터페이스
        //strings(adaptee) -> Collections.enumeration() (adapter) -> Enumeration(TargetInterface)
        //이 코드가 client code가 되는 것.
        Enumeration<String> enumeration = Collections.enumeration(strings);

        //enumeration이라는 adaptee를 받아
        //      Collections.list라는 adapter를 통해
        //          ArrayList 타입의 list라는 target으로 반환
        ArrayList<String> list = Collections.list(enumeration);



        //2. io
            //String이 인자로 들어가 InputStream이 나오고
        try(InputStream is = new FileInputStream("input.txt");
            //InputStream이 들어가 InputStreamReader
            InputStreamReader isr = new InputStreamReader(is);
            //InputStreamReader가 들어가 BufferedReader가 나옴.
            BufferedReader reader = new BufferedReader(isr); ) {

            while(reader.ready()){
                System.out.println(reader.readLine());
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
