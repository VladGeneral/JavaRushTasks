package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a<0 && a%2 ==0)
            System.out.println("четное однозначное число");
        if (a<0 && a%2 !=0)
            System.out.println("нечетное однозначное число");

        if (a>0 && a%2 ==0)
            System.out.println("положительное четное число");
        if (a>0 && a%2 !=0)
            System.out.println("положительное нечетное число");
    }
}
