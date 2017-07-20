package com.mainacademy.lesson1;
import java.util.Scanner;

/**
 * Created by Olga on 20.07.2017.
 */

public class MyFirstClass {
    public static void main(String[] arg) {
        System.out.println("Hello world!!!");
        System.out.println("new row");

        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        System.out.println("line 1 = "+line1+"; " +"line 2 = "+line2);
    }
}
