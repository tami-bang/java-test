package org.example.basic.bangjihyun.unitone;

import java.util.ArrayList;

public class Member {
    // 📌 필드
    private String name;
    private String memberId;
    private ArrayList<Book> borrowedBooks;

    // 📌 생성자
    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    // 📌 책 대여
    public boolean borrow(Book book) {
        if (!book.isBorrowed()) {
            if (book.borrowBook()) {
                borrowedBooks.add(book);
                System.out.println(name + "님이 책을 대여했습니다: " + book.getTitle());
                return true;
            }
        } else {
            System.out.println("이미 대여 중인 책입니다: " + book.getTitle());
        }
        return false;
    }

    // 📌 책 반납
    public boolean returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            if (book.returnBook()) {
                borrowedBooks.remove(book);
                System.out.println(name + "님이 책을 반납했습니다: " + book.getTitle());
                return true;
            }
        } else {
            System.out.println("이 회원이 대여한 책이 아닙니다: " + book.getTitle());
        }
        return false;
    }

    // 📌 대여 중인 책 목록 출력
    public void listBorrowedBooks() {
        System.out.println(name + "님의 대여 중인 책 목록:");
        if (borrowedBooks.isEmpty()) {
            System.out.println(" - 대여 중인 책이 없습니다.");
        } else {
            for (Book book : borrowedBooks) {
                System.out.println(" - " + book.getTitle());
            }
        }
    }

    // 📌 Getter
    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }
}
