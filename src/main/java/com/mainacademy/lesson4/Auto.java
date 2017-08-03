package com.mainacademy.lesson4;

/**
 * Created by Olga on 01.08.2017.
 */
public class Auto {
    public static void main(String[] args) {
        AutoClass car1 = new AutoClass("Smart", 140, 2006, 90, "white");
        AutoClass car2 = new AutoClass("Ford", "yellow");

        AutoClass car3 = new AutoClass();

        int speed1 = car1.getSpeed();
        System.out.println("Speed car1 = "+speed1);

        car2.setSpeed(120);
        System.out.println("Speed car2 = "+ car2.getSpeed());

        AutoClass car4 = new AutoClass();
        AutoClass car5 = new AutoClass();

        System.out.println("getNumOfCars = "+ car4.getNumOfCars());

    }
}
