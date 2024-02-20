package org.example.Lison1.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Input: n = 234
        //Output: 15
        //Explanation:
        //Product of digits = 2 * 3 * 4 = 24
        //Sum of digits = 2 + 3 + 4 = 9
        //Result = 24 - 9 = 15
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = scanner.nextInt();
        int result = resultPrMinusSum(n);
        System.out.println("Результат:");
        System.out.println(result);
    }

    public static int resultPrMinusSum(int n) {
        int pr = 1;
        int sum = 0;
        while (n != 0) {
            pr *= n % 10; //todo : Test todo
            sum += n % 10;
            n /= 10;
        }
        return pr-sum;
    }
}
