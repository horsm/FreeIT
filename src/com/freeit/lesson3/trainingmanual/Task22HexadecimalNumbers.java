package com.freeit.lesson3.trainingmanual;

/*
Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
записаных по правилам Java, с помощью регулярных выражений и вывести их на
страницу.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task22HexadecimalNumbers {
    public static void main(String[] args) {
        String string = "Написать 0x7A4 программу, выполняющую 0xEE327 поиск в строке шестнадцатеричных 0x10F447 чисел";
        Pattern pattern =Pattern.compile("0x\\p{XDigit}+");
        Matcher matcher =pattern.matcher(string);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
