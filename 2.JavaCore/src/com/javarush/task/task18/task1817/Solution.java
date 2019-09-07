package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(args[0]);

        int charaters = 0;
        int space = 0;
while (fileInputStream.available()>0){
    char readChar = (char) fileInputStream.read();
    if (readChar == ' '){
        charaters++;
        space++;
    }
    else{
        charaters++;
    }


}
        fileInputStream.close();
        double exist= (double) space/charaters*100.00;
        System.out.printf("%.2f", exist);
    }
}
