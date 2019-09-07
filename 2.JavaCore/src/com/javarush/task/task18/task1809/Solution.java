package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream1 = new FileInputStream(reader.readLine());
        FileOutputStream outputStream = new FileOutputStream(reader.readLine());

        ArrayList<Integer> arrayList = new ArrayList<>();
        while (inputStream1.available()>0){
            arrayList.add(inputStream1.read());
        }
        inputStream1.close();
        Collections.reverse(arrayList);

        for (int i = 0; i <arrayList.size() ; i++) {
            outputStream.write(arrayList.get(i));
        }
        outputStream.close();
    }
}
