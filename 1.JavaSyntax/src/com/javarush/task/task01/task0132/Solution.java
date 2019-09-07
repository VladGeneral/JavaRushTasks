package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int countMod, countDiv, countLocal, finalValue = 0;
        countLocal = number;
            for (int i = 0; i < countLocal; i++) {
                 countDiv = countLocal/10;
                 countMod = countLocal%10;
                 finalValue += countMod;
                 countLocal = countDiv;
             }
    return finalValue;
    }
}