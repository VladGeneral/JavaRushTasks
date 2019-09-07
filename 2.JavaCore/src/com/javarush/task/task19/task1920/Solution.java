package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.SortedMap;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader file = new BufferedReader(new FileReader("2.txt"));

        SortedMap<String,Double> sortedMap = new TreeMap<>();
        SortedMap<String,Double> secondMap = new TreeMap<>();


        while (file.ready()){
            String[] str = file.readLine().split("\\s");
            String name = str[0];
            Double currentValue = Double.parseDouble(str[1]);
            Double value = sortedMap.getOrDefault(name,0.00);
            sortedMap.put(name,currentValue+value);
        }
        file.close();
        Double maxValue = Collections.max(sortedMap.values());

        sortedMap.forEach((k,v)->{
            if (maxValue.equals(v)){
               secondMap.put(k,v);
                //System.out.println(k);
            }
        });

        secondMap.forEach((k,v)-> System.out.println(k));
    }
}
