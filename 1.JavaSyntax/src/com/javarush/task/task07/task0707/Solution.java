package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList <String> list = new ArrayList<String>();
        list.add("ffff");
        list.add("fsfff");
        list.add("ffxff");
        list.add("ffvff");
        list.add("ffhff");
        System.out.println(list.size());
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));

        }
    }
}
