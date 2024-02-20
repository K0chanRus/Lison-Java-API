package org.example.Lison3.Task10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Петров", 101, 5000, Arrays.asList(5, 4, 3));
        Student student2 = new Student("Пузиков", 102, 5000, Arrays.asList(5, 4, 3));
        Student student3 = new Student("Иванова", 103, 5000, Arrays.asList(5, 4, 3));
        Student student4 = new Student("Петрова", 101, 5000, Arrays.asList(5, 4, 3));
        Student student5 = new Student("Толканюк", 103, 5000, Arrays.asList(5, 4, 3));

        List<Student> studentList = new ArrayList<>(Arrays.asList(student1, student2, student3, student4, student5));

        for (Student student : studentList) {
            if (student.getSurname().endsWith("ова") && student.evenGrades()){
                System.out.println("Surname = " + student.getSurname());
                System.out.println("Stependia = " + student.getStependia());
            }
        }
    }
}
