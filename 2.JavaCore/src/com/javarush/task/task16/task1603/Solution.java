package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        SpecialThread a = new SpecialThread();
        SpecialThread b = new SpecialThread();
        SpecialThread c = new SpecialThread();
        SpecialThread d = new SpecialThread();
        SpecialThread e = new SpecialThread();

        Thread ta = new Thread(a);
        Thread tb = new Thread(b);
        Thread td = new Thread(c);
        Thread tc = new Thread(d);
        Thread te = new Thread(e);

        list.add(ta);
        list.add(tb);
        list.add(td);
        list.add(tc);
        list.add(te);

    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
