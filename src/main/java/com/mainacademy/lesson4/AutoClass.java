package com.mainacademy.lesson4;

/**
 * Created by Olga on 01.08.2017.
 */
public class AutoClass {
    private String model;
    private int maxSpeed;
    private int year;
    private int speed;
    public String color;
    public static int numOfCars;

    public AutoClass(String model, int maxSpeed, int year, int speed, String color) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.speed = speed;
        this.color = color;
    }

    public AutoClass(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public AutoClass() {
        numOfCars++;
    }

    public AutoClass(int speed) {
        this.speed = speed;
    }

    public static int getNumOfCars() {
        return numOfCars;
    }

    public static void setNumOfCars(int numOfCars) {
        AutoClass.numOfCars = numOfCars;
    }

    public void setMaxSpeed2(int maxSpeed) {
        maxSpeed = 1;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }


    public void setModel(String model) {
        this.model = model;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
