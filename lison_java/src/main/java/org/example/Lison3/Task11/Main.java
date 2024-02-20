package org.example.Lison3.Task11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    //Даны следующие сведения о кубиках: размер каждого кубика (длина ребра в
    //целых сантиметрах), его цвет (красный, желтый, зеленый тд) и материал
    //(деревянный, металлический, картонный и тд.). Найти:
    //         - количество кубиков желтого цвета и их суммарный объем;
    //         - количество деревянных кубиков с ребром 3 см
    public static void main(String[] args) {
        List<Cube> cubeList = new ArrayList<>(Arrays.asList(
                new Cube(3, "красный", "металический"),
                new Cube(10, "желтый", "картонный"),
                new Cube(3, "зеленый", "деревянный")
        ));

        int count = 0;
        int sumVol = 0;
        int countDer = 0;
        for (int i = 0; i < cubeList.size(); i++) {
            if (cubeList.get(i).getColor().equals("желтый")){
                count ++;
                sumVol += cubeList.get(i).getVoluem();
            }
            if (cubeList.get(i).getMaterial().equals("деревянный") && cubeList.get(i).getLenght() == 3){
                countDer ++;
            }
        }
        System.out.println("count = " + count);
        System.out.println("sumVol = " + sumVol);
        System.out.println("countDer = " + countDer);

    }
}
