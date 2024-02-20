package org.example.Lison3.Task10;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor

public class Student {
    private String surname;
    private Integer group;
    private Integer stependia;
    private List<Integer> grades;

    public boolean evenGrades() {
        Integer sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return sum % 2 == 0;
    }
}