package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        while (inputStream.available()>0){
            arrayList.add(inputStream.read());
        }
        inputStream.close();

        int count = 0;
        for (int i = 0; i < arrayList.size() ; i++) {
            for (int j = i+1; j <arrayList.size() ; j++) {
                if (arrayList.get(i)==arrayList.get(j)){
                    arrayList.remove(j);
                    count++;
                    j--;
                }
            }
            hashMap.put(arrayList.get(i),count);
            count = 0;
        }


        Integer min = Collections.min(hashMap.values());

            for (Map.Entry entry: hashMap.entrySet()){
                int key = (int) entry.getKey();
                int value = (int) entry.getValue();
                if (value == min){
                    System.out.print(key + " ");
                }
            }
    }
}
