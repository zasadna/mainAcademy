package com.mainacademy.lesson1;

import java.util.Scanner;

/**
 8.
 Реализуй метод printCircleLength. Параметр метода — радиус окружности. Метод должен вывести на экран длину окружности, рассчитанной по формуле: L = 2 * Pi * radius.
 Результат — дробное число (тип double).
 В качестве значения Pi использовать значение 3.14.
 */

public class PrintCircleLength8 {
    public static void main(String[] args) {
       int radius; // радиус окружности

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус окружности");
        radius = sc.nextInt();

       printCircleLength(radius);

    }

    public static double printCircleLength(int radius) {
        double Pi = Math.PI; // или 3.14
        double L = 2 * Pi * radius;
        System.out.println("Длину окружности = "+L);
        return L;
    }
}
