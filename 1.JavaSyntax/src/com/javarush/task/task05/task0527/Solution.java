package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        Dog pitDog = new Dog("pit",12,4);
        Cat tomCat = new Cat("tom",22,23);
        Cat blackCat = new Cat("black",35,15);
        Cat kidCat = new Cat("tomy",12,6);
        Cat girlCat = new Cat("Rebeka",18,31);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

   public static class Dog{
       String name;
       int height;
       int tail;

       public Dog(String name, int height, int tail) {
           this.name = name;
           this.height = height;
           this.tail = tail;
       }
   }
   public static class Cat{
       String name;
       int height;
       int tail;

       public Cat(String name, int height, int tail) {
           this.name = name;
           this.height = height;
           this.tail = tail;
       }
   }
}
