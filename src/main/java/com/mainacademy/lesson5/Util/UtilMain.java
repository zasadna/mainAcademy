package com.mainacademy.lesson5.Util;

/**
 * Created by Olga on 03.08.2017.
 */
public class UtilMain {
    public static void main(String[] args) {
        Pair<Integer,String> p1 = new OrderedPair<Integer,String>(11, "cat");
        Pair<Integer,String> p2 = new OrderedPair<Integer,String>(22, "dog");
        Pair<Integer,String> p3 = new OrderedPair<Integer,String>(22, "dog");
        boolean same12 = Util.<Integer,String> compare(p1,p2);
        System.out.println(same12);
        boolean same23 = Util.<Integer,String> compare (p2,p3);
        System.out.println(same23);

    }
}
