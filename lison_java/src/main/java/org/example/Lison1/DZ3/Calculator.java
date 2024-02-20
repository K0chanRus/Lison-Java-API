package org.example.Lison1.DZ3;

public class Calculator {
    public int calculate(char op, int a, int b) {
        // Введите свое решение ниже
        if (op == '+') {
            return a + b;
        } else if (op == '-') {
            return a - b;
        } else if (op == '/') {
            return a / b;
        } else if (op == '*') {
            return a * b;
        }else {
            return op;
        }
    }
}
