package 코드업.코드업기초4_1;

import java.util.Scanner;

public class Java1089 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 1; i < n ; i++) {
            a += d;
        }

        System.out.println(a);

    }
}
