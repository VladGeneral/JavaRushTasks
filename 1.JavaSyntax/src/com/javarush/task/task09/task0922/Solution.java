package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Date date = dateFormat.parse(reader.readLine());
        SimpleDateFormat rdf = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(rdf.format(date).toUpperCase());


    }
}
