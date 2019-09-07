package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
       HashMap<String,String> map = new HashMap<>();
       map.put("1","Vlxxad");
        map.put("2","Vlad");
        map.put("3","Vlad");

        map.put("4","Vlad");
        map.put("5","Vlad");
        map.put("6","Vlad");

        map.put("7","Vlasd");
        map.put("8","Vlassd");
        map.put("9","Vlasssd");
        map.put("10","Vlasssd");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<String, String> pair : map.entrySet()) {
            list.add(pair.getValue());
        }
        for (int i = 0; i <list.size() ; i++) {
            String nameList = list.get(i);
            int count = 0;

            for (Map.Entry<String,String> pair : map.entrySet()){
                if (nameList.equals(pair.getValue())){
                    count++;
                }
            }
            if (count>1){
                removeItemFromMapByValue(map,nameList);
            }


        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
