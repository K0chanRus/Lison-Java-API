package org.example.Lison1.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Дана последовательность N целых чисел.
        // Найти количество положительных чисел, после которых
        //следует отрицательное число.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сколько цыфр вы будете вводить");
        int number = scanner.nextInt();
        System.out.println("Ввод:");
        int result = sumPositiveThenNegativeNum(number);
        System.out.println(result);

    }

    public static int sumPositiveThenNegativeNum(int number) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int count = 0;
        int k = 1;
        while (k != number) {
            int secondNumber = scanner.nextInt();
            if (firstNumber > 0 & secondNumber < 0) {
                count += 1;
            }
            firstNumber = secondNumber;
            k += 1;
        }
        return count;
    }
}
