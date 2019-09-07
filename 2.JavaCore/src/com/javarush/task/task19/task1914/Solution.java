package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream firstStream = System.out;

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(byteArrayOutputStream);

        System.setOut(stream);

        testString.printSomething();

        String result = byteArrayOutputStream.toString();

        System.setOut(firstStream);

        String[] str = result.split("\\s");

//        ArrayList<Integer> list = new ArrayList<>();
//
//        for (int i = 0; i <str.length ; i++) {
//            list.add(Integer.parseInt(str[i]));
//        }


        if (str[1].equals("+")){
           Integer a = Integer.parseInt(str[0]);
           Integer b = Integer.parseInt(str[2]);

            System.out.println(str[0]+ " "+ str[1] + " "+ str[2] + " " + str[3]+ " "+ (a+b));
        }

        if (str[1].equals("-")){
            Integer a = Integer.parseInt(str[0]);
            Integer b = Integer.parseInt(str[2]);

            System.out.println(str[0]+ " "+ str[1] + " "+ str[2] + " " + str[3]+ " "+ (a-b));
        }
        if (str[1].equals("*")){
            Integer a = Integer.parseInt(str[0]);
            Integer b = Integer.parseInt(str[2]);

            System.out.println(str[0]+ " "+ str[1] + " "+ str[2] + " " + str[3]+ " "+ (a*b));
        }


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

