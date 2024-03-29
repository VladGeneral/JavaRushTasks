package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class University   {
private String name;
private int age;
private List<Student>  students = new ArrayList<>();

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }



    public Student getStudentWithAverageGrade(double averageGrade) {
        //TODO:
        Student student = null;

        for (Student student1 : students) {
            if (student1.getAverageGrade() == averageGrade){
                student = student1;
            }
            
        }

        return student;
    }

    public Student getStudentWithMaxAverageGrade() {
        //TODO:
        Student student = null;
        double maxAverageGrade = 0;
        for (Student student1 : students) {
            if (student1.getAverageGrade() > maxAverageGrade){
                maxAverageGrade = student1.getAverageGrade();
                student = student1;
            }
        }


        return student;
    }

    public Student getStudentWithMinAverageGrade() {
        //TODO:
        Student student = null;
        double minAverageGrade = 100;
        for (Student student1 :students) {
            if (student1.getAverageGrade() < minAverageGrade){
                minAverageGrade = student1.getAverageGrade();
                student = student1;
            }
        }
        return student;
    }

    public void expel(Student student){
        students.remove(student);
    }
}