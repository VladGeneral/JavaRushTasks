package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
            //if (string = null) throw new TooShortStringException();
      try {
          int firstIndex = string.indexOf("\t");
          // System.out.println(firstIndex);
          int secondIndex = string.indexOf("\t",firstIndex+1);
          // System.out.println(secondIndex);


              return string.substring(firstIndex+1,secondIndex);

      } catch (Exception e){
          throw new TooShortStringException();
      }

    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
