package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
     int a;
     int b;
     int c;
    public static void main(String[] args) {

    }
    public Solution() {

    }
    private Solution(int a) {
        this.a = a;
    }

    protected Solution(int a, int b) {
       this.a = a;
       this.b = b;
    }


     Solution(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

