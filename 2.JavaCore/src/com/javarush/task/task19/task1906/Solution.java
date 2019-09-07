package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String f1 = reader.readLine();
        String f2 = reader.readLine();
        reader.close();

        ArrayList<Character> list = new ArrayList<>();

        FileReader fileReader = new FileReader(f1);
        FileWriter fileWriter = new FileWriter(f2);

        int count = 0;

        while (fileReader.ready()){
            int data = fileReader.read();
            count++;
            if (count%2==0){
                fileWriter.write(data);
            }
        }
        fileReader.close();
        fileWriter.close();

    }
}
