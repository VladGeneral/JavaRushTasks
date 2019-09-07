package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    static {
        map.put(0,"ноль");
        map.put(1,"один");
        map.put(2,"два");
        map.put(3,"три");
        map.put(4,"четыре");
        map.put(5,"пять");
        map.put(6,"шесть");
        map.put(7,"семь");
        map.put(8,"восемь");
        map.put(9,"девять");
        map.put(10,"десять");
        map.put(11,"одиннадцать");
        map.put(12,"двенадцать");
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(reader1.readLine()));
        reader1.close();
        String line = "";
        while (reader.ready()){
            line += reader.readLine();

            String[] str = line.split("\\s");
            for (int i = 0; i <str.length ; i++) {
                for (Map.Entry entry:map.entrySet()){
                    Integer key = (Integer) entry.getKey();
                    String value = (String) entry.getValue();


                    String s = key.toString();
                    if (s.equals(str[i])){
                        str[i] = value;
                    }

                }
            }

            for (int i = 0; i <str.length ; i++) {
                System.out.print(str[i]+" ");
            }
            System.out.println();
            line = "";

        }
        reader.close();


    }
}
