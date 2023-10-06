package com.example.LibraryMVC.models;

import java.util.ArrayList;
import java.util.List;

public class Borrower {
    private int id;
    private static int nextId = 1;
    private String name;
    private List<Book> borrowedBooks = new ArrayList<>();

    public Borrower () {
        id = nextId++;
    }

    public Borrower(String name) {
        this();
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        book.setBorrowed(true);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.setBorrowed(false);
    }
}
