package com.javarush.task.task16.task1626;

public class Solution {
    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountdownRunnable(), "Уменьшаем").start();
        new Thread(new CountUpRunnable(), "Увеличиваем").start();
    }

    public static class CountUpRunnable implements Runnable{
        //Add your code here - добавь код тут
        private int countIndexUp = Solution.number;
        private int countIndexMin = 0;

        @Override
        public void run() {
            try {

                while (countIndexMin < countIndexUp){


                    System.out.println(toString());
                  Thread.sleep(500);

          }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        @Override
        public String toString() {
            return Thread.currentThread().getName() + ": " + (++countIndexMin);
        }
    }


    public static class CountdownRunnable implements Runnable {
        private int countIndexDown = Solution.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    if (countIndexDown == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }


}
