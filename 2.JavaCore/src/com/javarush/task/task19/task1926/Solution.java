package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(reader1.readLine()));
        StringBuilder builder = new StringBuilder();
       reader1.close();

        while (reader.ready()){
            builder.append(reader.readLine());
            builder.reverse();
            System.out.println(builder.toString());
            builder.setLength(0);

        }
        reader.close();
    }
}
