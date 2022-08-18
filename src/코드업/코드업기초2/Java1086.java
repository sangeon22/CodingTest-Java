package 코드업.코드업기초2;

import java.util.Scanner;

public class Java1086 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float w = scanner.nextFloat();
        float h = scanner.nextFloat();
        float b = scanner.nextFloat();
        scanner.close();

        float total = (w * h * b) / 8 /1024 /1024;
        System.out.printf("%.2f MB",total);

    }
}
