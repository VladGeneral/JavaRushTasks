package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
  //  Map<String,String > map = new HashMap<>();
//    map.put("name","vlad");
//    map.put("country","russia");
//    map.put("city", "asdadsda");
//    map.put("age","12");

//        map.put("name",null);
//        map.put("country",null);
//        map.put("city", null);
//        map.put("age",null);

      //  System.out.println(getQuery(map));
    }
    public static String getQuery(Map<String, String> params) {

         StringBuilder builder = new StringBuilder();
         for (Map.Entry<String,String> entry:params.entrySet()){

             if (entry.getValue() !=null){
               //  builder.append(entry.getKey() + " = " + "'"+ entry.getValue()+"' and ");
                 builder.append(String.format("%s = '%s'", entry.getKey(), entry.getValue()));
                 builder.append(" and ");
             }
         }
         if(builder.length()>=5){
             builder.setLength(builder.length()-5);
         }

         return builder.toString();
    }
}
