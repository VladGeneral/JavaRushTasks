package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("sdsd",21,"sdsdsds");
        Man man2 = new Man("sdsds",22,"sdssd");
        Woman woman1 = new Woman("xxxx",22,"sssss");
        Woman woman2 = new Woman("ggggg",44,"sss");
        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);

    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }
    public static class Woman {
        String name;
        int age;
        String address;


        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString(){
            return name + " "+age + " " + address;
    }

    }
}
