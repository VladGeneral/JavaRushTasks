package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут
            t1.start();
            t1.join();
            t2.start();
            t2.join();
        t1.printResult();
        t2.printResult();
    }


        public static class Read3Strings extends Thread{
        ArrayList<String> result = new ArrayList<>();

            private int count = 0;
            @Override
            public void run() {

                try {
                    while (count < 3){

                            result.add(reader.readLine());

                        count++;

                }

            }
                catch (Exception e){

                }
            }

            public void printResult() {
                for (String str: result
                     ) {
                    System.out.print(str + " ");
                }
                System.out.println();
                //result.forEach(System.out::println);
            }
        }
    //add your code here - добавьте код тут
}
