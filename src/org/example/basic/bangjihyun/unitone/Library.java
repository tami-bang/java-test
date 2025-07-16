package org.example.basic.bangjihyun.unitone;

import java.util.ArrayList;

public class Library {
    // 📌 필드
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    // 📌 생성자
    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    // 📌 책 추가
    public void addBook(Book book) {
        books.add(book);
        System.out.println("책이 추가되었습니다: " + book.getTitle());
    }

    // 📌 회원 추가
    public void addMember(Member member) {
        members.add(member);
        System.out.println("회원이 등록되었습니다: " + member.getName());
    }

    // 📌 제목으로 책 검색
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        System.out.println("해당 제목의 책을 찾을 수 없습니다: " + title);
        return null;
    }

    // 📌 모든 책 목록 출력
    public void listAllBooks() {
        System.out.println("📚 전체 책 목록:");
        if (books.isEmpty()) {
            System.out.println(" - 등록된 책이 없습니다.");
        } else {
            for (Book book : books) {
                System.out.println(" - " + book.getTitle() + " (" + (book.isBorrowed() ? "대여 중" : "대여 가능") + ")");
            }
        }
    }

    // 📌 대여 가능한 책 목록 출력
    public void listAvailableBooks() {
        System.out.println("✅ 대여 가능한 책 목록:");
        boolean found = false;
        for (Book book : books) {
            if (!book.isBorrowed()) {
                System.out.println(" - " + book.getTitle());
                found = true;
            }
        }
        if (!found) {
            System.out.println(" - 대여 가능한 책이 없습니다.");
        }
    }
}
