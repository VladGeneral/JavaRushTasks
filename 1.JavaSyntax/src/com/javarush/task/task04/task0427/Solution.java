package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        String b = String.valueOf(a);
        if (a>0 && a<1000) {
            if (b.length() == 1 && a % 2 == 0)
                System.out.println("четное однозначное число");
            if (b.length() == 1 && a % 2 != 0)
                System.out.println("нечетное однозначное число");
            if (b.length() == 2 && a % 2 == 0)
                System.out.println("четное двузначное число");
            if (b.length() == 2 && a % 2 != 0)
                System.out.println("нечетное двузначное число");
            if (b.length() == 3 && a % 2 == 0)
                System.out.println("четное трехзначное число");
            if (b.length() == 3 && a % 2 != 0)
                System.out.println("нечетное трехзначное число");
        }

    }
}
