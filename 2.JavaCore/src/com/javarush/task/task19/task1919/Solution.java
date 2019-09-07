package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.*;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        SortedMap<String,Double> map = new TreeMap<>();

//        File file = new File("2.txt");
//        FileReader reader = new FileReader(file);
        BufferedReader file = new BufferedReader(new FileReader(args[0]));
        //FileReader file = new FileReader(args[0]);
//        while (reader.ready()){
//            String str ="";
//
//            str = reader.read();
//        for (Map.Entry entry:map.entrySet()){
//                String key = (String) entry.getKey();
//                Double value = (Double) entry.getValue();
//
//
//            }
//
//
//        }
           while (file.ready()){
               String[] str = file.readLine().split("\\s");
               String name = str[0];
               Double currentValue = Double.parseDouble(str[1]);
               Double value = map.getOrDefault(name,0.00);
               map.put(name,value+currentValue);
           }
                file.close();
           for (Map.Entry entry: map.entrySet()){
               String key = (String) entry.getKey();
               Double value =(Double) entry.getValue();
               System.out.println(key + " "+ value);

           }

    }
}
