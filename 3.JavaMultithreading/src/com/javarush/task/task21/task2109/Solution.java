package com.javarush.task.task21.task2109;

/*
Запретить клонирование
*/
public class Solution {
    public static class A implements Cloneable {
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof A)) return false;

            A a = (A) o;

            if (getI() != a.getI()) return false;
            return getJ() == a.getJ();
        }

        @Override
        public int hashCode() {
            int result = getI();
            result = 31 * result + getJ();
            return result;
        }

        private int i;
        private int j;

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }

        @Override
        protected A clone() throws CloneNotSupportedException {
            A a = (A) super.clone();
            return a;
        }
    }

    public static class B extends A {
        private String name;

        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        protected B clone() throws CloneNotSupportedException {
            B b = (B) super.clone();
            throw new CloneNotSupportedException();
        }
    }

    public static class C extends B {
        public C(int i, int j, String name) {
            super(i, j, name);
        }

        @Override
        protected C clone() throws CloneNotSupportedException {
           return new C(getI(),getJ(),getName());
        }

    }

    public static void main(String[] args) {
//        C c = new C(12,12,"ss");
//        C clone = null;
//        try {
//            clone = c.clone();
//        }
//        catch (CloneNotSupportedException e){
//            e.printStackTrace();
//        }
//
//        System.out.println(c);
//        System.out.println(clone);


    }
}
