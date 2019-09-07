package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String,Cat> map = new HashMap<>();
        Cat cat1 = new Cat("Vas");
        map.put("Vas", cat1);
        Cat cat2 = new Cat("Fed");
        map.put("Fed", cat2);
        Cat cat3 = new Cat("Mur");
        map.put("Mur", cat3);
        Cat cat4 = new Cat("Pus");
        map.put("Pus", cat4);
        Cat cat5 = new Cat("V");
        map.put("V", cat5);
        Cat cat6 = new Cat("S");
        map.put("S", cat6);
        Cat cat7 = new Cat("F");
        map.put("F", cat7);
        Cat cat8 = new Cat("M");
        map.put("M", cat8);
        Cat cat9 = new Cat("P");
        map.put("P", cat9);
        Cat cat10 = new Cat("C");
        map.put("C", cat10);
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        HashSet<Cat> set = new HashSet<>();
        for (Map.Entry<String,Cat> element : map.entrySet()){
            Cat value = element.getValue();
            set.add(value);
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
