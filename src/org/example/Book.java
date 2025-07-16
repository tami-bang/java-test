package org.example;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
    }

    public boolean borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
            return true;
        }
        return false;
    }

    public boolean returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "제목: " + title + ", 저자: " + author + ", ISBN: " + isbn + ", 대여 여부: " + (isBorrowed ? "대여중" : "대여가능");
    }

    // Getter methods (필요 시 추가)
    public String getTitle() { return title; }
    public boolean isBorrowed() { return isBorrowed; }
}
