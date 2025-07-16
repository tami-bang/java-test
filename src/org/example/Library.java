package org.example;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public void listAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void listAvailableBooks() {
        for (Book book : books) {
            if (!book.isBorrowed()) {
                System.out.println(book);
            }
        }
    }
}
