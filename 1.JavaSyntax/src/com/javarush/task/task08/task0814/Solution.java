package com.javarush.task.task08.task0814;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i <20 ; i++) {
            set.add(i);
        }
return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {

     Iterator<Integer>   it = set.iterator();
     while (it.hasNext()){
         Integer text = it.next();
         if (text>10){
             it.remove();
         }
     }
     return(HashSet)set;
    }

    public static void main(String[] args) {

    }
}
