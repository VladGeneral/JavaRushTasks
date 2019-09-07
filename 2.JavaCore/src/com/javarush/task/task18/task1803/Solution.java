package com.javarush.task.task18.task1803;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());

        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        while (inputStream.available()>0){
            list.add(inputStream.read());
        }
        inputStream.close();

        int count = 0;
        for (int i = 0; i < list.size() ; i++) {
                for (int j = i+1; j <list.size() ; j++) {
                    if (list.get(i)== list.get(j)) {
                        list.remove(j);
                        count++;
                        j--;
                    }
                }

            map.put(list.get(i), count);
            count = 0;

        }

        int endedValue = -1;
        for(Map.Entry entry : map.entrySet()){
            int value = (int) entry.getValue();
            if (value > endedValue){
                endedValue = value;
            }
        }

        for (Map.Entry entry : map.entrySet()){
            int key = (int) entry.getKey();
            int value = (int) entry.getValue();
            if (value == endedValue){
                System.out.print(key + " ");
            }
        }



    }
}
