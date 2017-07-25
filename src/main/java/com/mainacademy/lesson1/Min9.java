package com.mainacademy.lesson1;

import java.util.Scanner;

/**
 9. Написать функцию min которая принимает 2 параметра и возвращает меньший из них.
 Тут надо использовать конструкцию if else
 public class Solution {
 public static int min(int a, int b) {
 //напишите тут ваш код
 }

 public static void main(String[] args) throws Exception {
 System.out.println(min(12, 33));
 System.out.println(min(-20, 0));
 System.out.println(min(-10, -20));
 }
 }
 */
public class Min9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введити два числа для сравнения");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("Меньшее из чисел = "+ min(x, y));
    }

    public static int min(int n1, int n2){
        if (n1>n2){
            return n2;
        }
        return n1;
    }
}
