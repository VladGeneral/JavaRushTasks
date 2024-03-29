package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            Person person;
            String name[] = fileScanner.nextLine().split("\\s",4);


                DateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
                Date date =dateFormat.parse(name[3]);
                person = new Person(name[1],name[2],name[0],date);
                return person;
              //  date = new SimpleDateFormat("dd/MM/yyyy").parse(String.format("%/s%/s%/s",name[3],name[4],name[5]));

            //person = new Person(name[1],name[2],name[0],date);

        }

        @Override
        public void close() throws IOException {
                    fileScanner.close();
        }
    }
}
