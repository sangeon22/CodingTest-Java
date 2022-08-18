package 코드업.코드업기초2;

import java.util.Scanner;

public class Java1085 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float h = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        float s = scanner.nextFloat();
        scanner.close();

        float total = (h * b * c * s) / 8 /1024 /1024;
        System.out.printf("%.1f MB",total);

    }
}
