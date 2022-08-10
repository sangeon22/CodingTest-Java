package 코드업.코드업기초2;

import java.util.Scanner;

public class Java1020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] a = scanner.next().split("\\-");
        scanner.close();

        int x = Integer.parseInt(a[0]);
        int y = Integer.parseInt(a[1]);

        System.out.printf("%06d%06d", x, y);
    }
}
