package 코드업.코드업기초3;

import java.util.Scanner;

public class Java1066 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        if (a % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");

        if (b % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");

        if (c % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");

    }
}
