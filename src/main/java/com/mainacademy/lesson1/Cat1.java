package com.mainacademy.lesson1;

/**
 1.Класс Cat и статическая переменная catCount
 В классе Cat создай статическую переменную public int catCount.
 Создай конструктор [public Cat()]. Пусть при каждом создании кота (нового объекта Cat) статическая переменная
 catCount увеличивается на 1. Создать 4 объектов Cat и вывести значение переменной catCount на экран.

 */
public class Cat1 {
    public static int catCount=0;

    Cat1(){
        catCount+=1;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 4 ; i++){
            Cat1 cat = new Cat1();
            //catCount++;
            System.out.println(cat+" "+catCount);
        }

    }
}

