package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        FileWriter writer = new FileWriter(args[1]);

        String line = "";

        while (reader.ready()){
            line += (char) reader.read();
        }
        reader.close();

        String[] str = line.split("\\s");

        for (int i = 0; i <str.length ; i++) {
            if (str[i].matches("\\S*\\d+\\S*")){
                writer.write(str[i] + " ");
            }

        }
        writer.close();

    }
}
