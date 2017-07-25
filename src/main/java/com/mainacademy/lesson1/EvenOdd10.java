package com.mainacademy.lesson1;

import java.util.Scanner;

/**
 10.
 Создать метод, проверяющий и сообщающий на экран, является ли целое число записанное в переменную n, чётным или нечётным.

 четное число - even number
 нечетное число - odd number

 */
public class EvenOdd10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введити два число");
        int x = sc.nextInt();
        evenOrOdd(x);
    }

    public static void evenOrOdd(int n){
        double r = n%2;

        if (r==0){
            System.out.println(n+" является четным числом");
        } else {
            System.out.println(n+" является нечетным числом");
        }

    }
}
