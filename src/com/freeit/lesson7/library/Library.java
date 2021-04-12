package com.freeit.lesson7.library;

import java.util.HashMap;
import java.util.Scanner;
/*
Создать класс Библиотека, поля:
• Список книг (изначально пустой)
 методы:
• добавить книгу (принимает объект книги и добавляет его в список товаров).
При попытке добавить книгу с id уже существующем в списке, вставка производится не должна
• получить все книги (метод ВОЗВРАЩАЕТ список всех книг в библиотеке)
• удалить книгу (метод принимает id книги и удаляет из списка книгу с соответствующим id)
• редактировать книгу (принимает объект книги и редактирует их список товаров)
Обратите внимание что id книги и индекс книги в списке — это разные вещи, не перепутайте.
Id книги — это поле вашего объекта, вы при его создании его задаете.
А индекс книги в списке книг, это по сути её порядковый номер в списке(начинается с 0).

 */

public class Library {
    HashMap<Integer, Book> listOfBooks = new HashMap<>();
    static int i = 0;

    public void addBook(Book book) {
        if (listOfBooks.containsKey(book.getId())) {
            System.out.println("Книга с таким ID уже существует!");
        } else {
            listOfBooks.put(book.getId(), book);
        }
    }

    public HashMap<Integer, Book> getAllBooks() {
        return listOfBooks;
    }

    public void deleteBook(int id) {
        if (listOfBooks.containsKey(id)) {
            listOfBooks.remove(id);
            System.out.println("Книга с ID = " + id + " успешна удалена!");
        } else {
            System.out.println("Книга с таким ID в библиотеке отсутсвует!");
        }
    }

    public void editBook(Book book) {
        try {
            System.out.println("-- Редактирование книги --");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите новый ID книги: ");
            book.setId(scanner.nextInt());
            System.out.print("Введите новое название книги: ");
            String newTitle = scanner.next();
            book.setTitle(newTitle);
            System.out.print("Введите жанр книги: ");
            String newGenre = scanner.next();
            book.setGenre(newGenre);

        } catch (Exception exception) {
            System.out.println("Вы допустили ошибку!");
        }
    }
}











































