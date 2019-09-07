package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();
        String sttr = "";
        while (fileReader.ready()){
            sttr += (char) fileReader.read();
        }
        String str ="";

        str = sttr.replaceAll("\\p{Punct}|\\n","");
        //sttr.replaceAll("\\s", "");
        fileWriter.write(str);
//        String[] str = sttr.split("[\\W\\s]");
//        for (int i = 0; i < str.length; i++) {
//            fileWriter.write(str[i]);
//        }
        fileReader.close();
        fileWriter.close();
    }
}

