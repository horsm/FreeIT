package com.freeit.lesson3.trainingmanual;

/*
Найти в строке не только запятые, но и другие знаки препинания.
Подсчитать общее их количество.
 */

public class Task18NumberOfCharacters {
    public static void main(String[] args) {
        String str = "\"Строковый литерал — это последовательность " +
                "\n символов,заключенных в двойные кавычки.\"";
        int n = 0;
        char symbol;
        for(int i = 0;i < str.length(); i++){
            symbol = str.charAt(i);
            if(symbol == ' ' || symbol == '.' || symbol == ',' || symbol == '?' || symbol == '!'
                    || symbol == '\"' || symbol == '-' || symbol == ':' || symbol == ';' || symbol == '('
                    || symbol == ')' || symbol == '\'' || symbol == '\n') {
                n++;
            }
        }
        System.out.println(str);
        System.out.println("У нас есть " + n + " знаков препинания");
    }
}
