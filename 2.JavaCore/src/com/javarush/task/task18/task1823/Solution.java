package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
try {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String str = reader.readLine();
    while (!str.equals("exit")){
        ReadThread readThread = new ReadThread(str);
        readThread.start();
        str = reader.readLine();
    }
    reader.close();
}
catch (Exception e){

}

    }

    public static class ReadThread extends Thread {
        FileInputStream fileInputStream;
        String fileName;
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        public ReadThread(String fileName) throws FileNotFoundException {
            fileInputStream = new FileInputStream(fileName);
            this.fileName = fileName;
        }

        @Override
        public void run() {
          try {
              while (fileInputStream.available()>0){
                  list.add(fileInputStream.read());
              }
              fileInputStream.close();

              int count = 0;

              for (int i = 0; i < list.size(); i++) {
                  for (int j = i+1; j < list.size() ; j++) {
                      if (list.get(i)==list.get(j)){
                          count++;
                          list.remove(j);
                          j--;
                      }
                  }
                  map.put(list.get(i),count);
                  count = 0;
              }
              Integer maxInteger = Collections.max(map.values());
              Integer maxCharater = 0;
              for (Map.Entry pair : map.entrySet()){
                  int key = (int) pair.getKey();
                  int value = (int) pair.getValue();
                  if (value == maxInteger){
                      maxCharater = key;
                      break;
                  }
              }

              resultMap.put(fileName,maxCharater);
              fileInputStream.close();

//              for (Map.Entry pair : resultMap.entrySet()){
//                  String key = (String) pair.getKey();
//                  Integer value = (Integer) pair.getValue();
//                  System.out.println(key + value);
//              }

          }
          catch (Exception e){

          }
        }
// implement file reading here - реализуйте чтение из файла тут
    }
}
