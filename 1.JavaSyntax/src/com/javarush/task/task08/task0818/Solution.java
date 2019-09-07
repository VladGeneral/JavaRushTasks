package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("p",400);
        map.put("o",400);
        map.put("i",400);
        map.put("u",400);


        map.put("y",1000);
        map.put("t",1000);
        map.put("r",1000);

        map.put("e",1000);
        map.put("w",1000);
        map.put("q",1000);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<HashMap.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            HashMap.Entry<String,Integer> pair = iterator.next();
            Integer value = pair.getValue();
            if (value<500){
                iterator.remove();
            }

        }
    }

    public static void main(String[] args) {

    }
}