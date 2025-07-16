package org.example.basic.bangjihyun.unitone;

public class Book {
    // 📌 필드
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;

    // 📌 생성자
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false; // 처음엔 대여되지 않음
    }

    // 📌 대여 처리
    public boolean borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
            return true;
        } else {
            return false; // 이미 대여 중
        }
    }

    // 📌 반납 처리
    public boolean returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            return true;
        } else {
            return false; // 대여 중이 아님
        }
    }

    // 📌 책 정보 문자열 반환
    @Override
    public String toString() {
        return String.format(
                "제목: %s\n저자: %s\nISBN: %s\n대여 여부: %s",
                title, author, isbn, (isBorrowed ? "대여 중" : "대여 가능")
        );
    }

    // 📌 Getter 추가 (필요시)
    public boolean isBorrowed() {
        return isBorrowed;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }
}
