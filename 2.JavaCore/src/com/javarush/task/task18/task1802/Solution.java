package com.javarush.task.task18.task1802;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File(reader.readLine());

        ArrayList<Integer> arrayList = new ArrayList<>();
        FileInputStream inputStream = new FileInputStream(file);

        while (inputStream.available() > 0){
            arrayList.add(inputStream.read());

        }
        inputStream.close();
        System.out.println(Collections.min(arrayList));
    }
}
