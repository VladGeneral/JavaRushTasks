package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().replaceAll("\\s+","");
        char[] mam = s.toCharArray();
        ArrayList<Character> listGlas = new ArrayList<>();
        ArrayList<Character> listSoglas = new ArrayList<>();

         for (int i = 0; i <mam.length ; i++) {
            if (isVowel(mam[i])){
                listGlas.add(mam[i]);
            }
            else
            {
                    listSoglas.add(mam[i]);

            }
         }
        for (int i = 0; i <listGlas.size() ; i++) {
            System.out.print(listGlas.get(i)+" ");

        }
        System.out.println();
        for (int i = 0; i <listSoglas.size() ; i++) {
            System.out.print(listSoglas.get(i)+" ");

        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}