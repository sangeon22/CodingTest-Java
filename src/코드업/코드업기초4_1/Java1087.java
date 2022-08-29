package 코드업.코드업기초4_1;

import java.util.Scanner;

public class Java1087 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 1; n > total; i++) {
            total += i;
        }

        System.out.println(total);
    }
}
