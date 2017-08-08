package com.mainacademy.lesson1;

/**
 2.Создать класс Cat с 3мя конструкторами:
 -Имя
 -Имя, Возраст, Вес.
 - Вес, Цвет,
 Создать по экземпляру кота используя различные конструкторы
 */
public class Cat2Main {
    public static void main(String[] args) {
        Cat2 cat1 = new Cat2("Barsik");
        Cat2 cat2 = new Cat2("Myrchik", 2,3);
        Cat2 cat3 = new Cat2(3,"white");

        System.out.println("Кот 1 - "+cat1.name);
        System.out.println("Кот 2 - "+cat2.name+", "+cat2.age+", "+cat2.weight);
        System.out.println("Кот 3 - "+cat3.weight+", "+cat3.color);

    }
}
