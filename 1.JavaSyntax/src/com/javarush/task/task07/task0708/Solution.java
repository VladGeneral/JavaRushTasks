package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;
    private static int x = 0;

    public static void main(String[] args) throws Exception {

        strings = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i <5 ; i++) {
            strings.add(reader.readLine());
        }
        for (int i = 0; i <strings.size() ; i++) {


            if ((strings.get(i).length()) > x) {
                x = strings.get(i).length();
            }

        }

        for (int i = 0; i <strings.size() ; i++) {
            if (x == strings.get(i).length()){
                list2.add(strings.get(i));
            }

        }
        for (int i = 0; i <list2.size() ; i++) {
            System.out.println(list2.get(i));

        }
    }
}
