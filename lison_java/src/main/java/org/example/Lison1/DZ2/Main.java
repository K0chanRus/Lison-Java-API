package org.example.Lison1.DZ2;

public class Main {
    public void printPrimeNums(){
        // Напишите свое решение ниже
        for (int i = 2; i < 1000; i++) {
            boolean primeNums = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    primeNums = false;
                    break;
                }
            }
            if (primeNums){
                System.out.println(i);
            }
        }
    }
}
