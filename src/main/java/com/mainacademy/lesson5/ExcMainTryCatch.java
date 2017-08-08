package com.mainacademy.lesson5;

/**
 * Created by Olga on 03.08.2017.
 */
public class ExcMainTryCatch {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        try{
            int x = arr[4];
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("Program Finish ok!");


        try{
           // <code to be monitored for exception>
            int x = arr[4];
        }catch (Exception exception){
            System.out.println("Exception = "+exception);
            return;

        }finally {
            //<code to be execute> код выполнится в любом случае
            System.out.println("Block finally");
        }
    }
}
