package com.mainacademy.lesson1;

/**
 2.Создать класс Cat с 3мя конструкторами:
 -Имя
 -Имя, Возраст, Вес.
 - Вес, Цвет,
 Создать по экземпляру кота используя различные конструкторы

 */
public class Cat2 {

    String name;
    Integer age;
    Integer weight;
    String color;

    public Cat2(String name) {
        this.name = name;
    }

    public Cat2(String name, Integer age, Integer weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat2(Integer weight, String color) {
        this.weight = weight;
        this.color = color;
    }
}
