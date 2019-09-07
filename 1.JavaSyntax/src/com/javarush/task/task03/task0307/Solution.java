package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        zerg1.name = "ssss";
        zerg2.name = "ssssad";
        zerg3.name = "ssssads";
        zerg4.name = "ssssdasd";
        zerg5.name = "ssssadsad";
        Protoss protoss1 = new Protoss();
        Protoss protoss2 = new Protoss();
        Protoss protoss3 = new Protoss();
        protoss1.name = "sdsdghs";
        protoss2.name = "sdsyuyuds";
        protoss3.name = "sdkjkjsds";
        Terran terran1 = new Terran();
        Terran terran2 = new Terran();
        Terran terran3 = new Terran();
        Terran terran4 = new Terran();
        terran1.name = "sdlx";
        terran2.name = "sdrrx";
        terran3.name = "sdqqx";
        terran4.name = "sdwwx";

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
