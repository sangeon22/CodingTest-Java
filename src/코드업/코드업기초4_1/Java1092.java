package 코드업.코드업기초4_1;

import java.util.Scanner;

public class Java1092 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        int i = 1;

        while (true) {
            if (i % a == 0 && i % b == 0 && i % c == 0) {
                break;
            }
            i++;
        }
        System.out.println(i);
    }
}
