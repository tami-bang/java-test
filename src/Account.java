package org.example.basic.bangjihyun.unittwo;

public class Account {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public Account(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("입금 완료: " + amount + "원");
        } else {
            System.out.println("유효하지 않은 입금 금액입니다.");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("잔액 부족. 출금 실패.");
        } else if (amount > 0) {
            balance -= amount;
            System.out.println("출금 완료: " + amount + "원");
        } else {
            System.out.println("유효하지 않은 출금 금액입니다.");
        }
    }

    public void printAccountInfo() {
        System.out.println("계좌번호: " + accountNumber);
        System.out.println("예금주: " + ownerName);
        System.out.println("잔액: " + balance + "원");
    }
}
