package com.mainacademy.lesson1;

/**
 6.
 Реализовать метод print. Метод должен вывести на экран переданную строку 4 раза. Каждый раз с новой строки.

 Требования:
 1. Программа должна выводить текст на экран.
 2. Метод main не должен вызывать System.out.println или System.out.print.
 3. Метод print должен выводить текст на экран.
 4. Метод main должен вызвать метод print класса только один раз.
 5. Метод print должен выводить на экран строку 4 раза. Каждый раз с новой строки.

 */
public class Print6 {
    public static void main(String[] args) {
        String str = "text";
        print(str);
    }

    public static void print(String str){

        for (int i = 0; i < 4; i++){
            int x = i+1;
            System.out.println(str+" "+ x);
        }
    }
}
