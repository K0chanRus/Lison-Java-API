package org.example.Lison2.DZ5;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;

class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;

    public static void sort(int[] mas) {
        Date dateNow = new Date();
        int[] start = mas.clone();
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd HH:mm ");
        try (FileWriter fw = new FileWriter("log.txt")) {
            for (int i = mas.length - 1; i >= 1; i--) {
                int[] newMas = {};
                for (int j = 0; j < i; j++) {
                    if (mas[j] > mas[j + 1]) {
                        int rerait = mas[j];
                        mas[j] = mas[j + 1];
                        mas[j + 1] = rerait;
                        newMas = mas;
                    }
                }
                if (Arrays.equals(mas, newMas) && Arrays.equals(mas, start) == false) {
                    fw.write(formatDate.format(dateNow));
                    fw.write(Arrays.toString(mas));
                    fw.append('\n');
                    fw.flush();
                }
            }
            fw.write(formatDate.format(dateNow));
            fw.write(Arrays.toString(mas));
            fw.append('\n');
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
