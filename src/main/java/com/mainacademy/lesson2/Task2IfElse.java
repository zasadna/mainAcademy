package com.mainacademy.lesson2;

/**
 * Created by Olga on 25.07.2017.
 */
public class Task2IfElse {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        String str1 = "Выполнилось условие (y-x)>10";
        String str2 = "Выполнилось условие (y-x)=10";
        String str3 = "Оба условия не выполнилось";

        if ((y-x)>10){
            System.out.println(str1);
        } else if ((y-x)==10){
            System.out.println(str2);
        } else {
            System.out.println(str3);
        }
    }
}