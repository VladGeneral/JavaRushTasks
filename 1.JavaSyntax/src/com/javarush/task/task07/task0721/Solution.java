package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = 0;
        int minimum = 0;

        int[] twenty = new int[20];
        for (int i = 0; i <twenty.length ; i++) {
            twenty[i] = Integer.parseInt(reader.readLine());
        }
        int x = twenty[0];
        int j = twenty[0];
        for (int i = 0; i < twenty.length ; i++) {

            if (x>twenty[i]){
                x = twenty[i];
            }
            minimum = x;
        }
        for (int i = 0; i < twenty.length ; i++) {

            if (x<twenty[i]){
                x = twenty[i];
            }
            maximum = x;
        }
        System.out.print(maximum + " " + minimum);
    }
}
