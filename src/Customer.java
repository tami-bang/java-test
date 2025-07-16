package org.example.basic.bangjihyun.unitthree;

public class Customer {
    String name;
    String grade;
    int point;

    public Customer(String name, String grade, int point) {
        this.name = name;
        this.grade = grade;
        this.point = point;
    }

    // 가격에서 등급별 할인 적용
    public int calculateDiscountPrice(int price) {
        double discountRate = 0.0;

        if (grade.equals("BASIC")) {
            discountRate = 0.0;
        } else if (grade.equals("SILVER")) {
            discountRate = 0.05;
        } else if (grade.equals("GOLD")) {
            discountRate = 0.10;
        }

        int discountedPrice = (int)(price * (1 - discountRate));
        return discountedPrice;
    }

    // 고객 정보 출력
    public void showCustomerInfo() {
        System.out.println("고객 이름: " + name);
        System.out.println("회원 등급: " + grade);
        System.out.println("적립 포인트: " + point);
    }

    // 구매 금액에 따라 포인트 적립
    public void earnPoints(int price) {
        double basePoints = price * 0.01;  // 기본 1%
        double extraPoints = 0.0;

        if (grade.equals("SILVER")) {
            extraPoints = price * 0.01;  // 추가 1%
        } else if (grade.equals("GOLD")) {
            extraPoints = price * 0.02;  // 추가 2%
        }

        point += (int)(basePoints + extraPoints);
    }
}
