package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();






    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String firstFileName = br.readLine();
            String secondFileName = br.readLine();
            try (BufferedReader reader = new BufferedReader(new FileReader(firstFileName))) {
                String s;
                while ((s = reader.readLine())!= null) {
                    allLines.add(s);
                }
            }
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(secondFileName))) {
                String sx;
                while ((sx = bufferedReader.readLine())!= null) {
                    forRemoveLines.add(sx);
                }
            }
        } catch (IOException e) {
        }

        Solution solution =new Solution();
        try {
            solution.joinData();
        } catch (CorruptedDataException e) {

        }

    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)){
            allLines.removeAll(forRemoveLines);
        }
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
