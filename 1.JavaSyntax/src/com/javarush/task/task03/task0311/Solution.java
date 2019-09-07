package com.javarush.task.task03.task0311;

/* 
Печатаем строки
*/

public class Solution {
    public static void main(String[] args) {
        writeToConsole("Hello world!");
    }

    public static void writeToConsole(String s) {
        String d = "printing: ";
        String fin = d+s;
        System.out.println(fin);
    }
}
