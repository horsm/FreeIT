package com.freeit.lesson7.library;

/*
(обязательное): В main:
• создаем объект библиотеки
• создаем пару тройку книг и добавляем эти книги в библиотеку
• получаем список книг из библиотеки, сортируем по полю title (по названию книги) и выводим в консоль.
• удаляем одну книгу
• получаем список книг из библиотеки, сортируем по порядку добавления (последние добавленные в начале) и выводим в консоль.
• редактируем одну книгу
• получаем список книг и выводим в консоль
 */

import java.util.*;

public class Run {
    public static void main(String[] args) {
        //• создаем объект библиотеки
        Library library = new Library();

        //• создаем пару тройку книг и добавляем эти книги в библиотеку
        Book book1 = new Book(1, "Умный малыш. Кто как кричит?", "Детская литература");
        Book book2 = new Book(2, "НИ СЫ. Будь уверен в своих силах и не позволяй сомнениям мешать тебе двигаться вперед", "Популярная психология");
        Book book3 = new Book(3, "Работа горя", "Поэзия");
        Book book4 = new Book(4, "The One. Единственный", "Фантастика");
        Book book5 = new Book(5, "Заживо в темноте", "Детектив");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);


        //• получаем список книг из библиотеки, сортируем по полю title (по названию книги) и выводим в консоль.
        System.out.println("---Получаем список книг из библиотеки, сортируем по полю title (по названию книги) и выводим в консоль.---");
        Set<String> sortTitle = new TreeSet<>();
        for (Map.Entry<Integer, Book> books : library.getAllBooks().entrySet()) {
            sortTitle.add(books.getValue().getTitle());
        }
        System.out.println(sortTitle);

        //• удаляем одну книгу
        library.deleteBook(1);

        //• получаем список книг из библиотеки, сортируем по порядку добавления (последние добавленные в начале)
        // и выводим в консоль.
        List<Book> listBook = new ArrayList<>();
        for (Map.Entry<Integer, Book> books : library.getAllBooks().entrySet()) {
            listBook.add(books.getValue());
        }
        Collections.reverse(listBook);
        System.out.println(listBook.toString());

        //• редактируем одну книгу
        library.editBook(book2);

        //• получаем список книг и выводим в консоль
        for (Map.Entry<Integer, Book> books : library.getAllBooks().entrySet()) {
            System.out.println(books.toString());
        }
    }
}
