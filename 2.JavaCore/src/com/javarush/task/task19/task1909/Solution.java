package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();
        String sttr = "";
        ArrayList<String> list = new ArrayList<>();
        while (fileReader.ready()){
            sttr += (char) fileReader.read();
            list.add(sttr);
            sttr = "";
        }
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i));
//        }

        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i).equals(".")){
                list.set(i,"!");
            }
        }

        for (int i = 0; i < list.size(); i++) {
            fileWriter.write(list.get(i));
        }
        fileReader.close();
        fileWriter.close();
       // String[] str = sttr.split()


    }
}
