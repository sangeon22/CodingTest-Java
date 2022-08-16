package 코드업.코드업기초2;

import java.util.Scanner;

public class Java1035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = Integer.valueOf(scanner.next(), 16);
        scanner.close();

        System.out.printf("%o", i);
    }
}
