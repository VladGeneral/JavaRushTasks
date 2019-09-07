package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File(reader.readLine());


        FileInputStream inputStream = new FileInputStream(file);
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (inputStream.available() > 0){
            arrayList.add(inputStream.read());
        }
        inputStream.close();
        System.out.println(Collections.max(arrayList));


    }
}
