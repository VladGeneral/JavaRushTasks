package com.javarush.task.task18.task1807;

import java.io.*;
import java.util.ArrayList;

/*
Подсчет запятых
*/
//&#044;
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File(reader.readLine());
        FileInputStream inputStream = new FileInputStream(file);
        ArrayList<Integer> list = new ArrayList<>();
        while (inputStream.available() > 0){
           list.add(inputStream.read());
        }
        inputStream.close();
        int count = 0;
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i).equals(44)){
                count++;
            }
        }
        System.out.println(count);
    }
}
