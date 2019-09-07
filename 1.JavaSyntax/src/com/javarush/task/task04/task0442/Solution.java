package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        while (true){

            int s = Integer.parseInt(reader.readLine());
            count += s;
            if (s == -1) {
                System.out.println(count);
                break;
            }

        }
    }
}
