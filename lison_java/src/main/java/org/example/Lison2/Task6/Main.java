package org.example.Lison2.Task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Дана последовательность из N целых чисел. Найти сумму чисел, оканчивающихся
        //на 5, перед которыми идет четное число.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов в последовательности:");
        int n = scanner.nextInt();
        System.out.println("Сумма элементов:");
        System.out.println(getSum(scanner, n));
    }

    /**
     * @param scanner
     * @param n
     * @return Сумма
     * @APInote Дана последовательность из N целых чисел. Найти сумму чисел,
     * оканчивающихся на 5, перед которыми идет четное число.
     */
    private static int getSum(Scanner scanner, int n) {
        int sum = 0;
        int current = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int next = scanner.nextInt();
            if (next % 10 == 5 && current % 2 == 0) {
                sum += next;
            }
            current = next;
        }
        return sum;
    }
}
