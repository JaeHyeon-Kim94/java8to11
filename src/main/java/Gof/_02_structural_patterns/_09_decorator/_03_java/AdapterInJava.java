package Gof._02_structural_patterns._09_decorator._03_java;

import java.io.*;
import java.util.*;

public class AdapterInJava {
    public static void main(String[] args) {
        //collections
        List<String> strings = Arrays.asList("a", "b", "c");
        Enumeration<String> enumeration = Collections.enumeration(strings);
        ArrayList<String> list = Collections.list(enumeration);


        //io
        try(InputStream is = new FileInputStream("input.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(isr)){
            //패턴의 목적에 따라 adpater 패턴으로도, Decorator 패턴으로도 볼 수 있다.
            while(reader.ready()){
                System.out.println(reader.readLine());
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
