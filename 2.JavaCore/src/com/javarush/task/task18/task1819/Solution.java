package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName1);
        FileInputStream inputStream1 = new FileInputStream(fileName2);
        reader.close();

        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();

        while (inputStream.available()>0){
            arrayList.add(inputStream.read());
        }
        inputStream.close();
        while (inputStream1.available()>0){
            arrayList1.add(inputStream1.read());
        }
        inputStream1.close();


        FileOutputStream outputStream = new FileOutputStream(fileName1);
        for (int i = 0; i <arrayList1.size() ; i++) {
            outputStream.write(arrayList1.get(i));
        }
        for (int i = 0; i <arrayList.size() ; i++) {
            outputStream.write(arrayList.get(i));
        }
        outputStream.close();
    }
}
