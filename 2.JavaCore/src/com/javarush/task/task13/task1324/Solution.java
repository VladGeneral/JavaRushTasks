package com.javarush.task.task13.task1324;

import java.awt.*;

/* 
Один метод в классе
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();

        Integer getAge();
    }

    public static abstract class Fox implements Animal {
            abstract void getPipka();
        public String getName() {
            return "Fox";
        }
    }
    public static class Pipka extends Fox{
        @Override
        public Color getColor() {
            return null;
        }

        @Override
        public Integer getAge() {
            return null;
        }

        @Override
        void getPipka() {

        }
    }
}
