package 코드업.코드업기초3;

import java.util.Scanner;

public class Java1070 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        scanner.close();

        switch (i) {
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("fall");
                break;

            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;

            default:
                System.out.println("입력 오류");

        }
    }
}
