package org.example.Progect;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@Data
public class PhoneBook {
    public static void menu() {
        System.out.println("Телефонная книга: \n" +
                "Введите цифру, соответствующую необходимому критерию: \n" +
                "1 - Открыть телефонную книгу \n" +
                "2 - Добавить контакт \n" +
                "3 - Удалить контакт \n" +
                "4 - Удалить номер \n" +
                "0 - Выход");
    }


    public static void openPhoneBook(HashMap<String, String> phoneBook) {
        for (Map.Entry entry : phoneBook.entrySet()) {
            System.out.println(entry);
        }
    }

    public static void addContact(HashMap<String, String> phoneBook) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        System.out.println("Введите номер телефона:");
        String phone = scanner.nextLine();
        if (phoneBook.containsKey(name)){
            if (phoneBook.get(name).contains(phone)){
                System.out.println("Контакт с такими данными существует!");
            }else {
                String newPhone = phoneBook.get(name) + " " + phone;
                phoneBook.put(name, newPhone);
                System.out.println("Контакт добавлен!");
            }
        }else {
            phoneBook.put(name, phone);
            System.out.println("Контакт добавлен!");
        }
    }

    public static void deleteContact(HashMap<String, String> phoneBook) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        if (phoneBook.containsKey(name)){
            phoneBook.remove(name);
            System.out.println("Контакт удален!");
        }else {
            System.out.println("Контакт с таким именем не найден!");
        }
    }

    public static void deleteNumber(HashMap<String, String> phoneBook) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        System.out.println("Введите номер телефона:");
        String phone = scanner.nextLine();
        if (phoneBook.get(name).contains(phone)){
            String oldPhone = phoneBook.get(name);
            String newPhone = oldPhone.replace(phone, "");
            phoneBook.put(name,newPhone);
            System.out.println("Номер удален!");
        }else {
            System.out.println("Такого номера телефона у данного контакта не существует!");
        }
    }
}
