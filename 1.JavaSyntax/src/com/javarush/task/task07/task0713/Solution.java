package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i <20 ; i++) {
            int x = Integer.parseInt(reader.readLine());
            list1.add(x);
        }
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        ArrayList<Integer> list4 = new ArrayList<Integer>();
        for (int i = 0; i < list1.size() ; i++) {
            int c = list1.get(i);
            if (c%3 == 0 || (c%3 == 0 && c%2 == 0)){
                list2.add(c);
            }
            if (c%2 == 0 || (c%2 == 0 && c%3 == 0)){
                list3.add(c);
            }
            if(c%3 !=0 && c%2 !=0) {
                list4.add(c);
            }

        }
        printList(list2);
        printList(list3);
        printList(list4);
    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));

        }

    }
}
