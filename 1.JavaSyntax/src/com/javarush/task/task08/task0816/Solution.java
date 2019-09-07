package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallcxone", df.parse("JUNE 1 1980"));
        map.put("Stallxcxone", df.parse("JUNE 1 1980"));
        map.put("Stallzne", df.parse("JUNE 1 1980"));
        map.put("Stallsssne", df.parse("JUNE 1 1980"));
        map.put("Stallwwwwne", df.parse("JUNE 1 1980"));
        map.put("Stalltttne", df.parse("JUNE 1 1980"));
        map.put("Stalluuune", df.parse("JUNE 1 1980"));
        map.put("Stalloioine", df.parse("JUNE 1 1980"));
        map.put("Stallggne", df.parse("JULY 1 1980"));
        map.put("Stallfffne", df.parse("SEPTEMBER 1 1980"));

        return map;
    }

    public static HashMap<String, Date> removeAllSummerPeople(HashMap<String, Date> map) {

        Iterator<Map.Entry<String,Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            HashMap.Entry<String,Date> pair = iterator.next();

            Date value = pair.getValue();

            if (value.getMonth() > 4 & value.getMonth() <8){
                iterator.remove();
            }

        }
        return map;




    }

    public static void main(String[] args) {
        try {
            System.out.println(createMap());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(removeAllSummerPeople(createMap()));
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
