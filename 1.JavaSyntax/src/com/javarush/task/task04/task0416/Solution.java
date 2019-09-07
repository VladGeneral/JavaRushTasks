package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double n = Double.parseDouble(reader.readLine());
        if (n%10 ==0)
            System.out.println("зеленый");
        if ( n%10 !=0 & n%10 <3)
            System.out.println("зеленый");
        if ( n%10 !=0 & n%10 >=5& n%10 <8)
            System.out.println("зеленый");
        if (n%10 >=3& n%10 <4)
            System.out.println("желтый");
        if (n%10 >=8& n%10 <9)
            System.out.println("желтый");
        if (n%10 >=4 & n%10 <5)
            System.out.println("красный");
        if (n%10 >=9 & n%10 <10)
            System.out.println("красный");
    }
}