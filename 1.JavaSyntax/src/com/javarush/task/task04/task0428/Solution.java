package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int count = 0;
        boolean n =(a>0);
        if (n)
            count++;
        boolean j =(b>0);
        if (j)
            count++;
        boolean m =(c>0);
        if (m)
            count++;
        System.out.println(count);
    }
}
