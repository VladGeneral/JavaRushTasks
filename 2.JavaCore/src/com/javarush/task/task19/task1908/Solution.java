package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine()));
//        String f1 = reader.readLine();
//        String f2 = reader.readLine();
        reader.close();

        String str ="";
//        FileReader fileReader = new FileReader(f1);
//        FileWriter fileWriter = new FileWriter(f2);
        while (fileReader.ready()){
            str += (char) fileReader.read();


        }
        String[] strCheck  = str.split("\\s");
        Pattern pattern = Pattern.compile("\\d+");

        for (int i = 0; i < strCheck.length; i++) {
            Matcher matcher = pattern.matcher(strCheck[i]);
            if (matcher.matches()){
                fileWriter.write(strCheck[i]+" ");
            }
        }
        fileReader.close();
        fileWriter.close();

    }
}
