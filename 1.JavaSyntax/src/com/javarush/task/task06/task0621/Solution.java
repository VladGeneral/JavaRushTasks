package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfaName = reader.readLine();
        Cat catGrandfa = new Cat(grandfaName);

        String grandmaName = reader.readLine();
        Cat catGrandma = new Cat(grandmaName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName,null ,catGrandfa);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName,catGrandma);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName,catMother,catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother,catFather);

        System.out.println(catGrandfa);
        System.out.println(catGrandma);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);

    }

    public static class Cat {
        private String name;
        private Cat parent;
        private Cat parenttwo;

        Cat(String name) {

            this.name = name;
        }

        Cat(String name, Cat parent) {
            this.name = name;
            this.parent = parent;
        }
        Cat(String name, Cat parent, Cat parenttwo) {
            this.name = name;
            this.parent = parent;
            this.parenttwo = parenttwo;
        }
        @Override
        public String toString() {
            if (parent == null && parenttwo == null)
                return "The cat's name is " + name + ", no mother" + ", no father";

            if (parent == null && parenttwo != null)
                return "The cat's name is " + name + ", no mother" + ", father is " + parenttwo.name;

            if (parent != null && parenttwo == null)
                return "The cat's name is " + name + ", mother is "+ parent.name + ", no father";

            else
                return "The cat's name is " + name + ", mother is "+ parent.name + ", father is " + parenttwo.name;



        }
    }

}
