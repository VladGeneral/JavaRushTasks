package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = new int[20];
        int[] m1 = new int[10];
        int[] m2 = new int[10];
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i <array.length ; i++) {
            int a = Integer.parseInt(reader.readLine());
            array[i] = a;
        }
        m1 = Arrays.copyOf(array,9);
        m2 = Arrays.copyOfRange(array,10,20);

        for (int i = 0; i <m2.length ; i++) {
            System.out.println(m2[i]);
        }

    }
}
