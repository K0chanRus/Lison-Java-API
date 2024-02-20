package org.example.Lison2.Task7;

public class Main {
    public static void main(String[] args) {
        //Дан массив целых чисел. Найти количество пар соседних элементов, где первый
        //элемент вдвое больше второго.
        int [] arr = new int[] {4, 8, 2, 6, 3, 10, 5};
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] * 2){
                sum +=1;
            }
        }
        System.out.println("Количество пар соединений:");
        System.out.println(sum);
    }
}
