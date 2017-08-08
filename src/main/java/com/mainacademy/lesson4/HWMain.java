package com.mainacademy.lesson4;

import static com.mainacademy.lesson4.HWRectangle.calculateSquareRectangle;
import static com.mainacademy.lesson4.HWSquere.calculateSquareSquere;

/**
 * Created by Olga on 03.08.2017.
 */
public class HWMain {
    public static void main(String[] args) {
        HWSquere s1 = new HWSquere();
        HWSquere s2 = new HWSquere(3);
        HWSquere s3 = new HWSquere(4,"white");

        HWRectangle r1 = new HWRectangle();
        HWRectangle r2 = new HWRectangle(5,6);
        HWRectangle r3 = new HWRectangle(7,8,"green");

        int x = s2.getX();
        int a = r2.getA();
        int b = r2.getB();

        calculateSquareSquere(x);
        calculateSquareRectangle(a,b);
    }

}
