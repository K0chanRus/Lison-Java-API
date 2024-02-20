package org.example.Lison2.Task8;

public class Main {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1.0, 2.0, 1.0);
        Vector vector2 = new Vector(1.0, 1.0, 1.0);
        System.out.println(vector1);
        System.out.println("vector1.length() = " + vector1.length());
        System.out.println("vector1.scalar(vector2) = " + vector1.scalar(vector2));
        Vector vector3 = vector1.proizved(vector2);
        System.out.println("vector3 = " + vector3);
        System.out.println("vector1.cosinus(vector2) = " + vector1.cosinus(vector2));
        Vector vector4 = vector1.sum(vector2);
        System.out.println("vector4 = " + vector4);
        Vector vector5 = vector1.derge(vector2);
        System.out.println("vector5 = " + vector5);
    }
}
