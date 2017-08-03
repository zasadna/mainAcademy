package com.mainacademy.lesson4;

/**
 * Created by Olga on 01.08.2017.
 */
public class TestVarArg {
    public int calcSum(int... value){
        int res = 0;

        for (int x:value){
            res+=x;
        }
        return res;
    }
}
