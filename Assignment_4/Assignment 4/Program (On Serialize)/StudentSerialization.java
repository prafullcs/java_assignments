package assignment4;           //part2_of_program8_on_serialization

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentSerialization {
    public static void main(String[] args) {
        // Write five student objects into the file
        writeStudentsToFile();

        // Read the same from the file
        List<Student> students = readStudentsFromFile();

        // Display student details along with result
        displayStudentDetails(students);

        // Find out how many students passed and failed in a particular subject
        findPassFailCount(students, "Maths");

        // Sort the students object based on marks
        sortStudentsByMarks(students);
    }

    public static void writeStudentsToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.dat"))) {
            oos.writeObject(new Student(1, "John", 75, "Maths"));
            oos.writeObject(new Student(2, "Alice", 35, "Science"));
            oos.writeObject(new Student(3, "Bob", 85, "Maths"));
            oos.writeObject(new Student(4, "Emily", 60, "Science"));
            oos.writeObject(new Student(5, "David", 40, "Maths"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readStudentsFromFile() {
        List<Student> students = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.dat"))) {
            while (true) {
                try {
                    Student student = (Student) ois.readObject();
                    students.add(student);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }

    public static void displayStudentDetails(List<Student> students) {
        for (Student student : students) {
            System.out.println(student.toString() + ", Result: " + student.getResult());
        }
    }

    public static void findPassFailCount(List<Student> students, String subject) {
        int passCount = 0;
        int failCount = 0;
        for (Student student : students) {
            if (student.getSubject().equalsIgnoreCase(subject)) {
                if (student.getMarks() >= 40) {
                    passCount++;
                } else {
                    failCount++;
                }
            }
        }
        System.out.println("Pass count in " + subject + ": " + passCount);
        System.out.println("Fail count in " + subject + ": " + failCount);
    }

    public static void sortStudentsByMarks(List<Student> students) {
        Collections.sort(students, Comparator.comparingDouble(Student::getMarks));
        System.out.println("Students sorted by marks:");
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
