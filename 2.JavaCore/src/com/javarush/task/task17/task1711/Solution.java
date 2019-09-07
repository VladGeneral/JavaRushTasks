package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));
        allPeople.add(Person.createMale("Петров Петр", new Date()));
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/y");

        SimpleDateFormat anotherDateFormat = new SimpleDateFormat("dd-MMM-y", Locale.ENGLISH);

        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 3) {
                        if (args[i + 1].equals("м")) {
                            allPeople.add(Person.createMale(args[i], dateFormat.parse(args[i + 2])));
                            System.out.println(allPeople.size() - 1);
                        } else {
                            allPeople.add(Person.createFemale(args[i], dateFormat.parse(args[i + 2])));
                            System.out.println(allPeople.size() - 1);
                        }
                    }
                    break;
                }

            case "-u":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 4) {
                        if (args[i + 2].equals("м")) {
                            allPeople.set(Integer.parseInt(args[i]), Person.createMale(args[i + 1], dateFormat.parse(args[i + 3])));
                        } else {
                            allPeople.set(Integer.parseInt(args[i]), Person.createFemale(args[i + 1], dateFormat.parse(args[i + 3])));
                        }

                    }
                    break;
                }

            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        allPeople.get(Integer.parseInt(args[i])).setName(null);
                        allPeople.get(Integer.parseInt(args[i])).setSex(null);
                        allPeople.get(Integer.parseInt(args[i])).setBirthDate(null);

                    }
                    break;
                }

            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        Person person = allPeople.get(Integer.parseInt(args[i]));
                        if (person.getSex().equals(Sex.MALE)) {
                            System.out.println(person.getName() + " м " + anotherDateFormat.format(person.getBirthDate()));
                        } else {
                            System.out.println(person.getName() + " ж " + anotherDateFormat.format(person.getBirthDate()));
                        }

                    }
                    break;
                }


        }
    }
}
