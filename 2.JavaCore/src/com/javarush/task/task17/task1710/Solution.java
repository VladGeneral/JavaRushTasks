package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));
        allPeople.add(Person.createMale("Петров Петр", new Date()));
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/y");
        SimpleDateFormat anotherDateFormat = new SimpleDateFormat("dd-MMM-y", Locale.ENGLISH);

        if (args[0].equals("-c")) {
            if (args[2].equals("м")) {
                allPeople.add(Person.createMale(args[1], dateFormat.parse(args[3])));
                System.out.println(allPeople.size() - 1);
            } else {
                allPeople.add(Person.createFemale(args[1], dateFormat.parse(args[3])));
                System.out.println(allPeople.size() - 1);
            }

        } else if (args[0].equals("-u")) {
            if (args[2].equals("м"))
                allPeople.set(Integer.parseInt(args[1]), Person.createMale(args[2], dateFormat.parse(args[4])));
            else
                allPeople.set(Integer.parseInt(args[1]), Person.createFemale(args[2], dateFormat.parse(args[4])));
        } else if (args[0].equals("-d")) {
            allPeople.get(Integer.parseInt(args[1])).setName(null);
            allPeople.get(Integer.parseInt(args[1])).setSex(null);
            allPeople.get(Integer.parseInt(args[1])).setBirthDate(null);
        } else if (args[0].equals("-i")) {
            Person person1 = allPeople.get(Integer.parseInt(args[1]));
            if (person1.getSex().equals(Sex.MALE)) {
                System.out.println(person1.getName() + " м " + anotherDateFormat.format(person1.getBirthDate()));
            } else {
                System.out.println(person1.getName() + " ж " + anotherDateFormat.format(person1.getBirthDate()));
            }


        }
    }
}
