package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    private static int x = 0;

    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <5 ; i++) {
            list.add(reader.readLine());
        }
        x = list.get(0).length();
        for (int i = 0; i <list.size() ; i++) {

            if (x>list.get(i).length()){
                x = list.get(i).length();
            }



        }
        for (int i = 0; i <list.size() ; i++) {
            if (x == list.get(i).length())
                list2.add(list.get(i));
        }
        for (int i = 0; i < list2.size() ; i++) {
            System.out.println(list2.get(i));

        }
    }
}
