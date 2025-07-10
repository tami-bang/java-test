//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
        // IntelliJ IDEA이(가) 수정을 제안하는 것을 확인할 수 있습니다.

        // Java 연산자
        // 산술 연산자
        System.out.printf("메롱!");
        int a = 10;
        int b = 3;
        System.out.println(a + b);

        // 대입 연산자
        int x = 5;
        x += 3;
        System.out.println(x);

        // 비교 연산자
        int num = 5;
        System.out.println(num == 5);

        // 논리 연산자
        boolean result = (5 > 3) && (10 > 5);
        System.out.println("(5 > 3) && (10 > 5) 결과는?" + result);

        // 증감 연산자
        int i = 1;
        i++;
        System.out.println("1? " + 1);

        // 조건(삼항) 연산자
        int score = 85;
        String grade = (score >= 90) ? "A" : "B";
        System.out.println("score >= 85 " + grade);

        // 비트 연산자
        int n = 5; // 0101
        int m = 3; // 0011
        System.out.println(n & m); // 1 (0001)

        // Java 조건문
        // if문
        int num1 = 10;
        if (num1 > 0) {
            System.out.println("양수입니다.");
        } else if (num1 == 0) {
        System.out.println("0입니다.");
        } else {
            System.out.println("음수입니다.");
        }
        // switch 문
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            default:
                System.out.println("기타 요일");
                break;
        }
        // Java 반복문
        // for 문
        for (int j = 0; j < 5; j++) {
            System.out.println(j);
        }
        // while 문
        int count = 3;
        while (count > 0) {
            System.out.println(count);
            count--;
        }
        // do-while 문
        int num2 = 0;
        do {
            System.out.println(num2);
            num2++;
        } while (num2 < 3);
    }
}