package org.example;

import java.util.ArrayList;

public class Member {
    private String name;
    private String memberId;
    private ArrayList<Book> borrowedBooks;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    public boolean borrow(Book book) {
        if (!book.isBorrowed() && book.borrowBook()) {
            borrowedBooks.add(book);
            return true;
        }
        return false;
    }

    public boolean returnBook(Book book) {
        if (borrowedBooks.contains(book) && book.returnBook()) {
            borrowedBooks.remove(book);
            return true;
        }
        return false;
    }

    public void listBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("대여 중인 책이 없습니다.");
        } else {
            for (Book book : borrowedBooks) {
                System.out.println(book);
            }
        }
    }

    // Getter methods (필요 시 추가)
    public String getName() { return name; }
}
