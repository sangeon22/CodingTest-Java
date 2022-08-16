package 코드업.코드업기초2;

import java.util.Scanner;

public class Java1045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        System.out.printf("%d\n", a+b);
        System.out.printf("%d\n", a-b);
        System.out.printf("%d\n", a*b);
        System.out.printf("%d\n", a/b);
        System.out.printf("%d\n", a%b);
        System.out.printf("%.2f\n", (float)a/b);
    }
}
