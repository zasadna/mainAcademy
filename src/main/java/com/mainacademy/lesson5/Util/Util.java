package com.mainacademy.lesson5.Util;

/**
 * Created by Olga on 03.08.2017.
 */
public class Util {
    public static <K,V> boolean compare (Pair<K,V>p1, Pair<K,V> p2){
        return p1.getKey().equals(p2.getKey())&& p1.getValue().equals(p2.getValue());
    }
}
