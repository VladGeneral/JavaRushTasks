package com.javarush.task.task05.task0532;

import java.io.*;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int N = Integer.parseInt(reader.readLine());
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(reader.readLine()));

        }
        int x = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (x< list.get(i)){
                x = list.get(i);
            }
            maximum = x;
        }

        System.out.println(maximum);
    }
}
