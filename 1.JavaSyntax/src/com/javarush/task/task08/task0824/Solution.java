package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> children = new ArrayList<>();

        ArrayList<Human> perents1 = new ArrayList<>();
        ArrayList<Human> perents2 = new ArrayList<>();
        perents1.add(new Human("m", false, 30, children));
        perents2.add(new Human("f", true, 35, children));
        children.add(new Human("ch1", true, 10));
        children.add(new Human("ch2", false, 12));
        children.add(new Human("ch3", true, 15));
        ArrayList<Human> gperents = new ArrayList<>();
        gperents.add(new Human("gf1", true, 55, perents1));
        gperents.add(new Human("gf2", true, 55, perents2));
        gperents.add(new Human("gm1", false, 50, perents1));
        gperents.add(new Human("gm2", false, 50, perents2));

        for (Human out : children){
            System.out.println(out.toString());
        }
        for (Human out : perents1){
            System.out.println(out.toString());
        }
        for (Human out : perents2){
            System.out.println(out.toString());
        }
        for (Human out : gperents){
            System.out.println(out.toString());
        }
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
