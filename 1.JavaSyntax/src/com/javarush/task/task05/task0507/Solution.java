package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double count = 0.0;
        double count2 = 0.0;
        while (true) {
            int a = Integer.parseInt(reader.readLine());


        double average = 0.0;
            if (a == -1) {

                average = count / count2;
                System.out.println(average);
                break;

            }
            else {

               count = count+ a;
               count2 ++;


            }
        }
    }
}

