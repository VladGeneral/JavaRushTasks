package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        reader.close();

        BufferedReader reader1 = new BufferedReader(new InputStreamReader(inputStream));
        while (reader1.ready()){
            String s = reader1.readLine();
            String[] words = s.split("\\s");
            if (words[0].equals(args[0])){
                for (int i = 0; i < words.length; i++) {
                    System.out.print(words[i]+ " ");
                }
                inputStream.close();
                reader1.close();
                break;
            }



        }

    }
}
