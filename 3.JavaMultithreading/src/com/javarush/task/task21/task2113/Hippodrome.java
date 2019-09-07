package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Hippodrome {

    static Hippodrome game;

    private List<Horse> horses = new ArrayList<>();

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void run(){
        for (int i = 0; i <100 ; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }
    public void move(){
        for (int i = 0; i <horses.size() ; i++) {
            horses.get(i).move();
        }
    }
    public void print(){
        horses.forEach(Horse::print);
        for (int i = 0; i <10 ; i++) {
            System.out.println();
        }
    }

    public Horse getWinner(){
        return horses.stream().max(Comparator.comparingDouble(Horse::getDistance)).get();
    }
    public void printWinner(){
        System.out.println("Winner is "+ getWinner().getName()+"!");
    }

    public static void main(String[] args) {
        Horse horse1 = new Horse("Horse1",3,0);
        Horse horse2 = new Horse("Horse2",3,0);
        Horse horse3 = new Horse("Horse3",3,0);


        game = new Hippodrome(new ArrayList<>());
        game.getHorses().add(horse1);
        game.getHorses().add(horse2);
        game.getHorses().add(horse3);

        game.run();
        game.printWinner();

    }
}
