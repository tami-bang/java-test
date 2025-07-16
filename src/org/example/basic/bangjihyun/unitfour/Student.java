package org.example.basic.bangjihyun.unitfour;

// Comparable 인터페이스를 구현하여 Student 객체들을 점수 기준으로 정렬할 수 있도록 합니다.
public class Student {
    // 속성: 이름(name), 점수(score)
    private String name;
    private int score;

    // 생성자: Student 객체를 초기화합니다.
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // Getter 메서드: 외부에서 이름 속성에 접근할 수 있도록 합니다.
    public String getName() {
        return name;
    }

    // Getter 메서드: 외부에서 점수 속성에 접근할 수 있도록 합니다.
    public int getScore() {
        return score;
    }

    // 메서드: 학생의 이름과 점수를 출력합니다.
    public void printInfo() {
        System.out.println("이름: " + name + ", 점수: " + score);
    }

    // 메서드: 점수가 90점 이상인 경우 고득점 학생임을 출력합니다.
    public void getHighScore() {
        if (score >= 90) {
            System.out.println("✨ 고득점 학생 ✨ - 이름: " + name + ", 점수: " + score);
        }
    }
}