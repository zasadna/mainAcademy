package com.mainacademy.lesson3;

/**
 * Created by Olga on 01.08.2017.
 */
public class Array1 {
    public static void main(String[] args) {
        int[] cats;  // мы объявили переменную массива
        int cats2[]; // другой вариант

        cats = new int[10];



        int[] a;
        double[] ar1;
        double  ar2[];

        a = new int[10]; // массив  из 10 элементов типа int
        int n = 5;
        ar1 =  new double[n]; // Массив из 5 элементов double
        // ar2 = {3.14, 2.71, 0, -2.5, 99.123}; // Массив из 6 элементов типа double

        int[] arr = {1,2,3,4,5};
        arr[1]= 123;
        System.out.println(arr.toString());
    }
}
