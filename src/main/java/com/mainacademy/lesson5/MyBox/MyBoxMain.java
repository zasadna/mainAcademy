package com.mainacademy.lesson5.MyBox;

/**
 * Created by Olga on 03.08.2017.
 */
public class MyBoxMain {
    public static void main(String[] args) {

        MyBox mb1 = new MyBox();

        try{
            mb1.setObject(Integer.valueOf(10));
            Integer x1 = (Integer)mb1.getObject(); //Оk
            mb1.setObject("Hello");
            Integer x2 = (Integer)mb1.getObject(); //Exception

        }catch (Exception e){
            System.out.println("Ошибка : "+e);

        }finally {
            mb1.setObject("Hello");
            String x2 = mb1.getObject().toString();
            System.out.println("Строка после блока finally : "+x2);
        }

    }
}
