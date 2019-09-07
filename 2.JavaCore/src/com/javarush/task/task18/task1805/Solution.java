package com.javarush.task.task18.task1805;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File(reader.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();

         FileInputStream fileInputStream = new FileInputStream(file);
            while (fileInputStream.available() > 0 ){
                arrayList.add(fileInputStream.read());
            }
            fileInputStream.close();

        Collections.sort(arrayList);
        for (int i = 0; i <arrayList.size() -1 ; i++) {
            if (arrayList.get(i).equals(arrayList.get(i+1))){
                i--;
                arrayList.remove(i+1);

            }
        }
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
}
