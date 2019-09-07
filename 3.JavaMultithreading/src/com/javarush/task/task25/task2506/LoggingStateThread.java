package com.javarush.task.task25.task2506;

import java.awt.*;

public class LoggingStateThread extends Thread {
        private Thread thread;
        private State lastTurget;

    public LoggingStateThread(Thread target) {
           this.thread = target;
            this.lastTurget = target.getState();
    }

    @Override
    public void run() {
        State target = null;
        //State lastTurget = thread.getState();
        System.out.println(lastTurget);
        while (lastTurget != State.TERMINATED){
            target = thread.getState();
            if (target != lastTurget){
                System.out.println(target);
                lastTurget = target;
            }
        }
        //System.out.println(target);
        thread.interrupt();


    }
}
