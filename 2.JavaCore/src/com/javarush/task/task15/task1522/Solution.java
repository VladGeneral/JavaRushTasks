package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args)  {

    }

    public static Planet thePlanet;

   static {
       readKeyFromConsoleAndInitPlanet();
       System.out.println(thePlanet);

   }

    public static void readKeyFromConsoleAndInitPlanet()  {
       try {
           BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           String s = reader.readLine();
           if (s.equals(Planet.SUN)) {
               thePlanet = Sun.getInstance();
           }
           else if (s.equals(Planet.EARTH)) {
               thePlanet = Earth.getInstance();
           }
           else if (s.equals(Planet.MOON)) {
               thePlanet = Moon.getInstance();
           }
           else {
               thePlanet = null;
           }
       }
       catch (Exception e){
           System.out.println("Пиздец");
       }

    }
}
