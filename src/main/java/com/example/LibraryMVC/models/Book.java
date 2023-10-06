package com.example.LibraryMVC.models;

public class Book {
    private int id;
    private static int nextId = 1;
    private String title;
    private String author;
    private String ISBN;
    private boolean borrowed;

    public Book () {
        this.id = nextId++;
    }

    public Book (String title, String author, String ISBN) {
        this();
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public int getId() {
        return id;
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

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }
}
