package 코드업.코드업기초2;

import java.util.Scanner;

public class Java1064 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        System.out.println(c > (a > b ? b : a) ? (a > b ? b : a) : c);
        System.out.println(Math.min(Math.min(a, b), c));
    }
}
