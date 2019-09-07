package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        //StringBuilder stringBuilder = new StringBuilder();

        String sttr ="";
        int count =0 ;
        FileReader fileReader = new FileReader(fileName);
        while (fileReader.ready()){
        sttr += (char) fileReader.read();



        }
       // System.out.println(sttr);
        String[] str = sttr.split("[^a-zA-Z]");

//        for (int i = 0; i <str.length ; i++) {
//            System.out.print(str[i]);
//        }

        for (int i = 0; i <str.length ; i++) {
            if (str[i].equals("world")){
                count++;
            }
        }
        fileReader.close();
        System.out.println(count);
    }
}
