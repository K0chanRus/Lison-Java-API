package org.example.Progect;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main() {
        PhoneBook.menu();
        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Маша", "8900845");
        phoneBook.put("Саша", "8999165");
        phoneBook.put("Петя", "8953658");
        phoneBook.put("Вася", "8900432");
        Scanner scanner = new Scanner(System.in);
        for (;;){
            PhoneBook.menu();
            Integer number = scanner.nextInt();
            if (number == 1) {
                PhoneBook.openPhoneBook(phoneBook);
            } else if (number == 2) {
                PhoneBook.addContact(phoneBook);
            } else if (number == 3) {
                PhoneBook.deleteContact(phoneBook);
            } else if (number == 4) {
                PhoneBook.deleteNumber(phoneBook);
            } else if (number == 0){
                break;
            }else {
                System.out.println("Цыфра не соответствует катерориям");
            }

        }
    }
}
