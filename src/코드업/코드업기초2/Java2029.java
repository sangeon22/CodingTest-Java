package 코드업.코드업기초2;

import java.util.Scanner;

public class Java2029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double v = scanner.nextDouble();
        scanner.close();

        System.out.printf("%.11f", v);
    }
}