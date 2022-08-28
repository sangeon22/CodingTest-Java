package LikeLion;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        while (true) {
            System.out.print("첫번째 숫자를 입력해주세요 : ");
            try {
                Scanner scanner = new Scanner(System.in);
                a = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("[입력오류] : 숫자로 입력해주세요.");
            }
        }

        while (true) {
            System.out.print("두번째 숫자를 입력해주세요 : ");
            try {
                Scanner scanner = new Scanner(System.in);
                b = scanner.nextInt();
                scanner.close();
                break;
            } catch (Exception e) {
                System.out.println("[입력오류] : 숫자로 입력해주세요.");
            }
        }

        System.out.printf("결과 : %d", a + b);
    }
}
