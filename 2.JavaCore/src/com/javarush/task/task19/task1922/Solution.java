package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(reader1.readLine()));
        reader1.close();
        String stroka = "";
        int count = 0;
        while (reader.ready()){
            stroka = reader.readLine();
            String[] str = stroka.split("\\s");
            for (int i = 0; i <str.length ; i++) {

                for (int j = 0; j <words.size() ; j++) {
                    if (str[i].equals(words.get(j))){
                        count++;
                    }
                }

            }
            if (count ==2){
                for (int i = 0; i <str.length ; i++) {
                    System.out.print(str[i] + " ");
                }
                System.out.println();
            }
            count = 0;

        }
        reader.close();

    }
}
