package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream(args [0]);
        String zalupa = "abcdefghijgklmnopqrstuvwxyz";
        int count = 0;
        while (inputStream.available() > 0 ){
            char c = (char) inputStream.read();
            if (zalupa.contains(Character.toString(c).toLowerCase())){
                count++;
            }
        }
        inputStream.close();
        System.out.println(count);






    }
}
