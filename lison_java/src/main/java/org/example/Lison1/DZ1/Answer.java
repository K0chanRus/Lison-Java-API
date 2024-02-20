package org.example.Lison1.DZ1;

public class Answer {
    public int countNTriangle(int n) {
        // Ввести решение
        if (n < 1) {
            return -1;
        } else{
            int sum = 0;
            while (n != 0) {
                sum += n;
                n -= 1;
            }
            return sum;
        }
    }
}
