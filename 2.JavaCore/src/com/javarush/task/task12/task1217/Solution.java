package com.javarush.task.task12.task1217;

/* 
Лететь, бежать и плыть
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Fly {
        void fly(String address);
    }

    public interface Run {
        void run(String goTo);
    }

    public interface Swim {
        void swim(int x);
    }

}
