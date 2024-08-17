package assignment4;   //part1_of_program8_on_serialization

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;
    private double marks;
    private String subject;

    public Student(int id, String name, double marks, String subject) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public String getSubject() {
        return subject;
    }

    public String getResult() {
        return marks >= 40 ? "Pass" : "Fail";
    }

    @Override
    public String toString() {
        return "Student ID: " + id + ", Name: " + name + ", Marks: " + marks + ", Subject: " + subject;
    }
}
