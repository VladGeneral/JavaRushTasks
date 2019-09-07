package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int one = Integer.parseInt(reader.readLine());
        int two = Integer.parseInt(reader.readLine());
        int three = Integer.parseInt(reader.readLine());
        if (one+two <= three || one+three <=two  || two+three <= one)
            System.out.println("Треугольник не существует.");
        else
            System.out.println("Треугольник существует.");
    }
}