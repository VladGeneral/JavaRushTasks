package com.javarush.task.task16.task1630;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

                static {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                    try {
                        firstFileName = reader.readLine();
                        secondFileName = reader.readLine();

                    }
                    catch (Exception e){
            e.printStackTrace();
                    }
                }
    //add your code here - добавьте код тут

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут

        public static class ReadFileThread extends Thread implements ReadFileInterface{
        private String fullFileName;
        private String fileContent = "";

            @Override
            public void setFileName(String fullFileName) {
                this.fullFileName = fullFileName;
            }

            @Override
            public String getFileContent() {
                return this.fileContent;
            }

//            @Override
//            public void join() throws InterruptedException {
//
//            }
//
//            @Override
//            public void start() {
//
//            }
            public  void run(){
                StringBuilder builder = new StringBuilder();
                String line;

                try {
                    BufferedReader reader = new BufferedReader(new FileReader(fullFileName));

                    while ((line = reader.readLine()) != null) {
                        builder.append(line + " ");


                    }
                    fileContent = builder.toString();
                    reader.close();
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }

        }
}
