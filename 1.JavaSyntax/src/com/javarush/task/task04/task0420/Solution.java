package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int x = a;
        int d = b;
        int f = c;
        for (int i = 0; i <3 ; i++) {

            if (x>=d && x>=f) {
                x = -999999999;
                System.out.print(a + " ");
            }
            else if (d>=x && d>=f ) {
                d = -999999999;
                System.out.print(b + " ");
            }
            else if (f>=x && f>=d ) {
                f = -999999999;
                System.out.print(c + " ");
            }


        }
    }
}
