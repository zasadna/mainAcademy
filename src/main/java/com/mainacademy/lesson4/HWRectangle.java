package com.mainacademy.lesson4;

/**
 * Created by Olga on 03.08.2017.
 */
public class HWRectangle {
    private int a;
    private int b;
    private String color;

    public HWRectangle() {
    }

    public HWRectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public HWRectangle(int a, int b, String color) {
        this.a = a;
        this.b = b;
        this.color = color;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void rectangle(int a, int b) {
        int resR = a*b;

        System.out.println("Площадь прямоугольник = "+resR);
    }
}
