package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String,String> HM = new HashMap<>();
        HM.put("Моисеевский","ывывыв");
        HM.put("ыыы","Владислав");
        HM.put("фывыв","вавав");
        HM.put("ыыыыыыы","Владислав");
        HM.put("ывxыыв","Владислав");
        HM.put("оы","Владислав");
        HM.put("иппмм","Моисеевский");
        HM.put("опрропо","ывывыв");
        HM.put("рррррп","ывыв");
        HM.put("пааапаппапап","папапап");
        return HM;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {

        int returnName = 0;
        for (String text : map.values()){
            if (text.equals(name)){

                returnName++;
            }

        }
        return returnName;


    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {

        int returnLastName = 0;
        for (String text : map.keySet()){
            if (text.equals(lastName)){
                returnLastName++;
            }

        }
        return returnLastName;
    }

    public static void main(String[] args) {

    }
}
