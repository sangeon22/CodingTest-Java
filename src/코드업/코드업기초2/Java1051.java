package 코드업.코드업기초2;

import java.util.Scanner;

public class Java1051 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        if (b >= a)
            System.out.print(1);
        else
            System.out.print(0);
    }
}
