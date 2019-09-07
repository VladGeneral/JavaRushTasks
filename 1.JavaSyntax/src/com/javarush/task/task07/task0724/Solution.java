package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human pers1 = new Human("ababa",true,19);
        Human pers2 = new Human("abassa",true,19);
        Human pers3 = new Human("abassba",false,21);
        Human pers4 = new Human("abaaba",true,22);
        Human pers5 = new Human("ssvcc",false,25,pers1,pers2);
        Human pers6 = new Human("ssvcc",false,25,pers1,pers2);
        Human pers7 = new Human("ssvcc",false,25,pers1,pers2);
        Human pers8 = new Human("ssvcc",false,25,pers1,pers2);
        Human pers9 = new Human("ssvcc",false,25,pers1,pers2);
        System.out.println(pers1.toString());
        System.out.println(pers2.toString());
        System.out.println(pers3.toString());
        System.out.println(pers4.toString());
        System.out.println(pers5.toString());
        System.out.println(pers6.toString());
        System.out.println(pers7.toString());
        System.out.println(pers8.toString());
        System.out.println(pers9.toString());

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















