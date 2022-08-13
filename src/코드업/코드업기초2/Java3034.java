package 코드업.코드업기초2;

import java.util.Scanner;

public class Java3034 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = Integer.valueOf(scanner.next(), 8);
        scanner.close();

        System.out.printf("%d", i);
    }
}
