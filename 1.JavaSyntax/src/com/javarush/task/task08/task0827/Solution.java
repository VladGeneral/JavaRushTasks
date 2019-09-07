package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args)throws ParseException {

        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException
    {

        SimpleDateFormat format = new  SimpleDateFormat ("MMMM d yyyy", Locale.ENGLISH);
        Date data = format.parse(date);
        Calendar cal = new GregorianCalendar();
        cal.setTime(data);
        int day = cal.get(Calendar.DAY_OF_YEAR);


        if (day%2 != 0){


            return true;
        }
        else {
            System.out.println(day);
            return false;
        }

    }
}
