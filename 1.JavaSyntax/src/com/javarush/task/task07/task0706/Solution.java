package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] num = new int[15];
        int chet =0;
        int nechet = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 15; i++) {
            num[i]= Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i <num.length ; i++) {
            if (i%2 == 0){
                chet +=num[i];
            }
            else{
                nechet +=num[i];
            }

        }
        if (chet>nechet){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        else {
            System.out.println( "В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
