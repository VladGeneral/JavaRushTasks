package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);

        ArrayList<Character> arrayList = new ArrayList<>();



        TreeMap<Character,Integer> map = new TreeMap<>();
        while (inputStream.available()>0){
            char s = (char) inputStream.read();
            arrayList.add(s);
        }
        inputStream.close();



        int count = 1;
        for (int i = 0; i <arrayList.size() ; i++) {


            for (int j = i+1; j < arrayList.size() ; j++) {
                if (arrayList.get(i)==arrayList.get(j)){
                    arrayList.remove(j);
                    count++;
                    j--;
                }

            }
            map.put(arrayList.get(i),count);
            count = 1;
        }



        for (Map.Entry<Character,Integer> pair :map.entrySet()){
            Character key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + " " + value);
        }


    }
}
