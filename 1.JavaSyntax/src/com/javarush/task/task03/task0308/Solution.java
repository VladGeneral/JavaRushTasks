package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int count;


        for (int i = 1;i<11;i++){

            count = x * i;
            x = count;


        }
        System.out.println(x);

    }
}
