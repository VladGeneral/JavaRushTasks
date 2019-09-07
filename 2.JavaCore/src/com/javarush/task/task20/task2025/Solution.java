package com.javarush.task.task20.task2025;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/*
Алгоритмы-числа
*/
public class Solution {
    public static long[] getNumbers(long N) {
        //
        //
       //long[] result = null;
//

//3600ms        PrintStream mainStream =System.out;
//        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//
//        PrintStream stream1 = new PrintStream(byteArrayOutputStream);
//
//        System.setOut(stream1);
//
//        ArrayList<Long> list = new ArrayList<>();
//        LongStream.range(1, N).filter((n) -> {
//                    final String number = Long.toString(n);
//                    return number.chars()
//                            .mapToDouble(v -> Math.pow(v - '0', number.length()))
//                            .sum() == n;
//                }).forEach(System.out::println);
//        String resultss = byteArrayOutputStream.toString();
//        System.setOut(mainStream);
//        String[] finalResults = resultss.split("\\s");
//
//        result = new long[finalResults.length];
//
//        for (int i = 0; i < finalResults.length; i++) {
//            result[i] = Long.valueOf(finalResults[i]);
//        }
//
//
//        return result;

// 2600ms       ArrayList<Long> list = new ArrayList<>();
//        for (int i = 1; i < N ; i++) {
//                String number = String.valueOf(i);
//                char[] charNumberArray = number.toCharArray();
//
//
//                double currentCheck = i;
//                double check =0;
//                for (int j = 0; j <charNumberArray.length ; j++) {
//
//                    double ccheck = Math.pow(charNumberArray[j] -'0' ,charNumberArray.length);
//                    check += ccheck;
//                }
//                if (currentCheck == check){
//                    list.add((long)i);
//                }
//
//        }
//        result = new long[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            result[i] = list.get(i);
//        }
//        return result;

        ArrayList<Long> numbers = new ArrayList<>();
        long[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474,
                54748, 92727, 93084, 548834, 1741725, 4210818, 9800817, 9926315, 24678050,
                24678051, 88593477, 146511208, 472335975, 534494836, 912985153, 4679307774L,
                32164049650L, 32164049651L, 40028394225L, 42678290603L, 44708635679L, 49388550606L,
                82693916578L, 94204591914L, 28116440335967L, 4338281769391370L, 4338281769391371L,
                21897142587612075L, 35641594208964132L, 35875699062250035L, 1517841543307505039L,
                3289582984443187032L, 4498128791164624869L, 4929273885928088826L};
        for (Long l:list) {
            if (l<N)
                numbers.add(l);
        }
        Collections.sort(numbers);
        long[] result = new long[numbers.size()];
        for (int i = 0; i < numbers.size(); i++){
            result[i] = numbers.get(i);
        }
        return result;
    }



    public static void main(String[] args) {
//       long start = System.currentTimeMillis();
//        long[] list = getNumbers(Long.MAX_VALUE);
//        long finish = System.currentTimeMillis();
//
//        System.out.println("Time consumed: " + (finish - start) + " ms");
//        if (list != null) {
//            for (int i = 0; i < list.length; i++) {
//                System.out.println(list[i]);
//            }
//        }
    }
}
