package com.javarush.task.task19.task1916;

import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

//может кому поможет -  в задаче Отслеживаем изменения
//        невероятно спасает итератор, тк избавляет от
//        необходимости следить за индексами, чтобы не
//        выйти за границы массива, также не понадобились
//        line и nextline

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) {
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
