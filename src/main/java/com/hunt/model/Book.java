package com.hunt.model;

public class Book {
    private long id; //название книги
    private String title; // автор книги
    private String author; // кто написал книгу, ее автор
    private double price; // Цена книги
    private BookGenre genre; // жанр книги

    public Book(long id, String title, String author, double price, BookGenre genre) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.genre = genre;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BookGenre getGenre() {
        return genre;
    }

    public void setGenre(BookGenre genre) {
        this.genre = genre;
    }
}

