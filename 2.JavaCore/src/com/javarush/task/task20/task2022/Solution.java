package com.javarush.task.task20.task2022;

import java.io.*;

/* 
Переопределение сериализации в потоке
*/
public class Solution implements Serializable, AutoCloseable {
    private transient FileOutputStream stream;
   private String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        this.stream = new FileOutputStream(fileName);
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
       // out.close();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {

        in.defaultReadObject();
        this.stream = new FileOutputStream(fileName,true);

        //in.close();
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException{
     // File myFile = File.createTempFile("2.txt",null);
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(myFile));
        Solution solution =  new Solution("2.txt");


        ObjectOutputStream objectOutputStream = new ObjectOutputStream(solution.stream);

        solution.writeObject("ssdsad");
        objectOutputStream.writeObject(solution);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(solution.fileName));

       // Solution newSolution = new Solution("2.txt");
        Solution loadSolution = (Solution) objectInputStream.readObject();
        loadSolution =(Solution) objectInputStream.readObject();
        objectInputStream.close();

        loadSolution.writeObject("ss2");


    }
}
