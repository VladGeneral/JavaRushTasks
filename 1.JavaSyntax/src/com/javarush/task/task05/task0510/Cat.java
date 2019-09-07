package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name;
    int weight;
    int age;
    String color;
    String  address;
    public void initialize(String name){
        this.name = name;
        this.weight = 2;
        this.age = 4;
        this.color = "green";
    }
    public void initialize(String name, int weight,int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "red";
    }
    public void initialize(String name,int age){
        this.name = name;
        this.age = age;
        this.weight = 8;
        this.color = "black";
    }
    public void initialize(int weight,String color){

        this.weight = weight;
        this.color = color;
        this.age = 4;
    }
    public void initialize(int weight,String color, String address){

        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 12;
    }
    public static void main(String[] args) {

    }
}
