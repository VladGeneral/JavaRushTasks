package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;

/* 
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0]),"Windows-1251"));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(args[1]),"UTF-8"));
//        Charset w1251 = Charset.forName("Windows-1251");
//        Charset utf8 = Charset.forName("UTF-8");


            StringBuilder builder = new StringBuilder();

        while (reader.ready()){
            builder.append(reader.readLine());
        }
        reader.close();


      writer.write(builder.toString());
        writer.close();
    }
}
