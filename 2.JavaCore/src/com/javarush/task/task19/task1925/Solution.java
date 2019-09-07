package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        StringBuilder stringBuilder = new StringBuilder();

        while (reader.ready()){
            stringBuilder.append(reader.readLine()).append(" ");
        }
        reader.close();
        String data = stringBuilder.toString();
        stringBuilder.setLength(0);

        for (String s:data.split(" ")){
            if (s.length()>6){
                stringBuilder.append(s).append(",");
            }
        }
        stringBuilder.setLength(stringBuilder.length()-1);
        String execute = stringBuilder.toString();
        writer.write(execute);
         writer.close();


    }

}
