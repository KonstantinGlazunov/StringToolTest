package de.aittr;

/*Создайте абстрактный класс StringTools, со статическими методами:

String FirstToUpperCase(String str);
Данный метод должен возвращать новую строку, в которой первый символ возведен в верхний регистр.
Например, FirstToUpperCase("apple") -> "Apple';

boolean isStartingFromCapital(String str); Данный метод должен показывать, начинается ли строка с большой буквы. Например,
 isStartingFromCapital("Apple") -> true;
isStartingFromCapital("apple") -> false;*/
public abstract class StringTools {

    public static String firstToUpperCase(String str) {
        String firstChar = str.substring(0,1).toUpperCase(); //первый символ в верхний регистр
        String lastString = str.substring(1, str.length());
        return firstChar + lastString;

    }

    public static boolean isStartingFromCapital(String str) {
        return (str.substring(0, 1).equals((str.substring(0, 1).toUpperCase()))) ?
                true : false;

    }

}


