package com.javarush.task.task15.task1515;

import java.io.*;

/* 
Статики-2
*/

public class Solution {
    public static int A;
    public static int B;
static {
    try  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       A = Integer.parseInt(reader.readLine());
       B = Integer.parseInt(reader.readLine());
    }
    catch (Exception e){
        System.out.println("Низя");
    }


}
    public static final int MIN = min(A, B);

    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
