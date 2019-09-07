package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 1;i<11;i++){
            int x = 1;
            for (int j = 1;j<11;j++){
                int count;

                count = i*j;
                x=count;

                System.out.print(x + " ");

            }
            System.out.println();
        }
    }
}
