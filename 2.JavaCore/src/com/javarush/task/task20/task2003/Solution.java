package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();
//    static {
//        properties.put("1", "А");
//        properties.put("2", "Б");
//
//    }


    public void fillInPropertiesMap() throws Exception {

//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//FileInputStream inputStream = new FileInputStream(reader.readLine());

//        load(inputStream);
        load(new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine()));
//        inputStream.close();
//        reader.close();

        //implement this method - реализуйте этот метод
    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties prop = new Properties();

        prop.putAll(properties);
//        for (Map.Entry<String,String> entry:properties.entrySet()){
//           prop.setProperty(entry.getKey(),entry.getValue());
//        }
        prop.store(outputStream,null);
        outputStream.close();
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties prop = new Properties();
        prop.load(inputStream);

//        for (Map.Entry<String,String> entry:properties.entrySet()){
//            prop.getProperty(entry.getKey(),entry.getValue());
//        }

//        for (String name : prop.stringPropertyNames()){
//            properties.put(name,prop.getProperty(name));
//        }
        prop.forEach((k,v) ->properties.put(String.valueOf(k),String.valueOf(v)));
        inputStream.close();
    }

    public static void main(String[] args) throws Exception {

    }
}
