package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream outputStream = new FileOutputStream(new File(reader.readLine()));
        InputStream inputStream2 = new FileInputStream(reader.readLine());
        InputStream inputStream3 = new FileInputStream(reader.readLine());

        byte[] b1 = new byte[inputStream2.available()];
        while (inputStream2.available() > 0){
            int count = inputStream2.read(b1);
            outputStream.write(b1,0,count);
        }
        byte[] b2 = new byte[inputStream3.available()];
        while (inputStream3.available() > 0){
            int count = inputStream3.read(b2);
            outputStream.write(b2,0,count);
        }


        inputStream2.close();
        inputStream3.close();
        outputStream.close();
    }
}
