package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        String b = String.valueOf(a);

        for (int i = 0; i < b.length() ; i++) {
                if (a%2 == 0){
                    even++;

                }
                else{
                    odd++;
                }
                a = a/10;

        }
        System.out.println("Even: "+even +" "+ "Odd: "+odd);
    }
}
