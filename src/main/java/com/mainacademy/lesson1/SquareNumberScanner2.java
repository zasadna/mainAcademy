package com.mainacademy.lesson1;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.StrictMath.round;
import static java.lang.StrictMath.sqrt;

/**
 2.
 Написать программу, которая считывает с клавиатуры целое число a и выводит квадрат этого числа (a * a).
 Для считывания данных с клавиатуры использовать метод nextInt() класса Scanner.

 Требования:
 1. Программа должна выводить текст.
 2. В программе необходимо создать объект типа Scanner.
 3. Программа должна считывать данные с клавиатуры.
 4. Программа должна выводить квадрат считанного числа.
 */

public class SquareNumberScanner2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Для вычесления квадрата числа введите чесло");
        int x = sc.nextInt();
        //Integer sx = x*x;
        double sx = pow(x,2);

        System.out.println("Квадрат вашего числа = "+sx);
    }
}
