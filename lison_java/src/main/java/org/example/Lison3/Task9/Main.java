package org.example.Lison3.Task9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Даны сведения об экспортируемых товарах: указывается наименование
    //товара, страна, экспортирующая товар, и объем поставляемой партии в штуках. Найти
    //страны, которые экспортируют данный(введенный с кл-ы) товар, и общий объем его экспорта.
    public static void main(String[] args) {
        Item item1 = new Item("Logka", "ru",10000);
        Item item2 = new Item("Vilka", "ru",10000);
        Item item3 = new Item("Nog", "en",129000);
        Item item4 = new Item("Tarelka", "ru",9000);
        Item item5 = new Item("Vilka", "en",10000);
        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);

        Scanner scanner = new Scanner(System.in);
        String searth = scanner.nextLine();

        ArrayList<String> country = new ArrayList<>();
        Integer sumVolume = 0;
        for (Item elem : itemList) {
            if (elem.getName().equals(searth)){
                sumVolume+= elem.getVolume();
                country.add(elem.getCountry());
            }
        }
        System.out.println(sumVolume);
        System.out.println("country = " + country);
    }
}
