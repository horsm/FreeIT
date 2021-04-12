package com.freeit.lesson3.trainingmanual;

/*
Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
которых есть параметры, например <p id=”p1”>, и замену их на простые теги
абзацев <p>.
 */

public class Task23SearchTags {
    public static void main(String[] args) {
        String str = "<p id=”p1”>О, память сердца! Ты сильней</p>\n" +
                     "<p style=\"text-indent: 25px;\">Рассудка памяти печальной</p>\n" +
                     "<div class=\"block1\">И часто сладостью твоей</div>\n" +
                     "<div class=\"example_toolbar\">Меня в стране пленяешь дальной.</div>";

        System.out.println(str);
        System.out.println();
        String sttingResult = str.replaceAll("<p\\s.+?>|<div>|<div\\s.+?>", "<p>");
        sttingResult = sttingResult.replaceAll("</div>", "</p>");
        System.out.println(sttingResult);
    }
}
