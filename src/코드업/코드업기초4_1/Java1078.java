package 코드업.코드업기초4_1;

import java.util.Scanner;

public class Java1078 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int n = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= n; i++) {
            if (i % 2 ==0) total += i;
        }
        System.out.println(total);
    }
}
