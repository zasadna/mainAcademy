package com.mainacademy.lesson4;

/**
 * Created by Olga on 01.08.2017.
 */
public class Method1 {
    public static void main(String[] args) {

        squere(6);
        rectangle(7,8);
        name("Olha");
    }

    public static void squere(int a) {
        /*int a = 2;
        int b = 3;*/

        int resS = a*a;

        System.out.println("Квадрат = "+resS);

    }

    public static void rectangle(int x, int y) {
      /*  int x = 4;
        int y = 5;*/

        int resR = x*y;

        System.out.println("Прямоугольник = "+resR);
    }

    private static void name(String str) {
        System.out.println(str);
    }
}
