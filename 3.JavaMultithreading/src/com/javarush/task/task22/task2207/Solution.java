package com.javarush.task.task22.task2207;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader inputStream = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
        reader.close();

        ArrayList<String> strings = new ArrayList<>();
        while (inputStream.ready()){
            String string = inputStream.readLine();
            strings.addAll(Arrays.asList(string.split(" ")));
        }
        inputStream.close();
//        for (int i = 0; i <strings.size() ; i++) {
//            System.out.println(strings.get(i));
//        }
        while (strings.size() >0){
            StringBuilder builder = new StringBuilder(strings.get(0));
            //builder.append(strings.get(0));
            String str1 = builder.toString();
            String str2 = builder.reverse().toString();
            strings.remove(str1);

                if (strings.contains(str2)){
                    Pair pair = new Pair();
                    pair.first = str1;
                    pair.second = str2;
                    result.add(pair);
                    strings.remove(str2);
                }
        }
//        for (int i = 0; i <result.size() ; i++) {
//            System.out.println(result.get(i));
//        }
    }

    public static class Pair {
        String first;
        String second;



        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
