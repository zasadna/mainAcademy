package com.mainacademy.lesson6;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Olga on 08.08.2017.
 */
public class LinkedList2 {
    public static void main(String[] args) {
        List<String> lst = new LinkedList<String>();
        lst.add("aa");
        lst.add("bbb");
        lst.add("ccc");
        System.out.println(lst);
        String str = lst.get(0);
        System.out.println(str);
        lst.add(1, "test");
        System.out.println(lst);

    }
}
