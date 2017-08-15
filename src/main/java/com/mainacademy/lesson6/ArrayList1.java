package com.mainacademy.lesson6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Olga on 08.08.2017.
 */
public class ArrayList1 {
    public static void main(String[] args) {
        Collection<String> myColl = new ArrayList<String>();

        myColl.add("aaa");
        myColl.add("bbbb");
        myColl.add("ccccc");
        myColl.add("bbbb");

        Collection<String> myColl2 = new ArrayList<String>();
        myColl2.add("Olga");

        System.out.println(myColl);
        int sizeOfColl = myColl.size();
        System.out.println(sizeOfColl);
        System.out.println(myColl.remove("bbbb"));
       // System.out.println(myColl.remove(0));
        System.out.println(myColl);
        System.out.println(myColl.containsAll(myColl2));
        System.out.println(myColl.equals(myColl2));
        System.out.println(myColl.retainAll(myColl2));

        Iterator<String> itr = myColl.iterator();

        while (itr.hasNext()){
            String element =itr.next();
            System.out.println(element+" ");
        }

        myColl.clear();
        System.out.println(myColl);


    }

}


