package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private char sex;
        private int weight;
        private int height;
        private int strength;

        public Human(int age, int strength) {
            this.age = age;
            this.strength = strength;
        }

        public Human(char sex, int strength) {
            this.sex = sex;
            this.strength = strength;
        }

        public Human(int weight, int height, int strength) {
            this.weight = weight;
            this.height = height;
            this.strength = strength;
        }

        public Human(String name, int age, int strength) {
            this.name = name;
            this.age = age;
            this.strength = strength;
        }

        public Human(String name, int age, char sex, int weight, int height, int strength) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.height = height;
            this.strength = strength;
        }

        public Human(String name, int age, char sex, int weight, int height) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.height = height;
        }

        public Human(String name, int age, char sex, int weight) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
        }

        public Human(String name, int age, char sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name) {
            this.name = name;
        }
    }
}
