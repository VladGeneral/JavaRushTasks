package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        String str ="";
        while (true){
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                str = reader.readLine();
                FileInputStream inputStream = new FileInputStream(str);
                inputStream.close();
            }
            catch (FileNotFoundException e){
                System.out.println(str);
                return;
            }
            catch (IOException e){
                e.printStackTrace();
            }


        }
    }


}
