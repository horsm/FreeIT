package com.freeit.lesson7.library;

/*
Создать класс Книга, поля:
• id (целое число)
• title (строка)
• genre (строка) (Если вы уже в себе уверены, создавайте еще один класс Genre и в класс Book вместо genre
включайте genreId, который будет ссылаться на жанр с соответствующим id)

 */
public class Book {
    private int id;
    private String title;
    private String genre;

    public Book(int id, String title, String genre) {
        this.id = id;
        this.title = title;
        this.genre = genre;
    }
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book { " +
                "id = " + id +
                ", Название = '" + title + '\'' +
                ", Жанр = '" + genre + '\'' +
                '}';
    }
}
