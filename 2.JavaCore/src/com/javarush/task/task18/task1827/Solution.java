package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    //public static volatile List<T> allProduсt = new ArrayList<>();

    static  {
        //add product
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            File file = new File(reader.readLine());
        BufferedReader fileReader = new BufferedReader(new FileReader(file));


        switch (args[0]){
            case "-c":
                synchronized (file){
                        while (fileReader.ready()){

                        }

                }
        }
    }
}
