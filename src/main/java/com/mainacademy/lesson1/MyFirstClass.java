package com.mainacademy.lesson1;
import java.util.Scanner;

/**
 * Created by Olga on 20.07.2017.
 */

public class MyFirstClass {
    public static void main(String[] args) {
        System.out.println("Hello world!!!");

        Scanner sc = new Scanner(System.in);

     /*   System.out.println("Ведите 2 символа");

        String line1 = sc.nextLine();
        String line2 = sc.nextLine();

        System.out.println("line 1 = "+line1+"; " +"line 2 = "+line2);
*/

     /*   Integer n1 = sc.nextInt();
        Integer n2 = sc.nextInt();
        Integer sum = n1+n2;

        System.out.println("Ведите 2 числа");
        System.out.println("n 1 = "+n1+"; " +"n 2 = "+n2);
        System.out.println("сумма = "+sum);

        int a = 1;
        float b = (float) 2.4;
        float w = 2.4F;
        double c = 3.44213;

        int a1 = 4;
        float b1 = a;

        int f1 = 4;
        double f2 = 6;
        double sum2 = f1/f2;

        System.out.println("sum2 = "+sum2);*/

        System.out.println("Введите 2 часла для сравнения");

        int x = sc.nextInt();
        int y = sc.nextInt();


        boolean boolEx = x<y;

        if (boolEx){
            System.out.println("x<y is true");
         } else {
            System.out.println("x<y is false");
        }

    }
}
