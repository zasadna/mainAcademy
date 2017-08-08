package com.mainacademy.lesson4;

/**
 * Created by Olga on 03.08.2017.
 */
public class HWSquere {
    private int x;
    private String color;

    public HWSquere() {
    }

    public HWSquere(int x) {
        this.x = x;
    }

    public HWSquere(int x, String color) {
        this.x = x;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void calculateSquareSquere(int x) {

        int resS = x*x;

        System.out.println("Площадь квадрата  = "+resS);

    }
}
