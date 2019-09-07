package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/
public class Solution implements Serializable {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
       System.out.println(new Solution(4));


//        try {
            File myFile = File.createTempFile("my_file_bleat",null);
           ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(myFile));
           Solution savedObject = new Solution(4);

           objectOutputStream.writeObject(savedObject);


           ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(myFile));
            Solution loadedObject = new Solution(15);
           loadedObject =(Solution) objectInputStream.readObject();


            System.out.println(savedObject.string.equals(loadedObject.string));
//        }
//        catch (IOException e){
//            System.out.println("IO");
//        }
//        catch (ClassNotFoundException e){
//            System.out.println("class not found");
//        }
    }

    private final transient String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
