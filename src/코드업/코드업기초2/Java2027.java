package 코드업.코드업기초2;

import java.util.Scanner;

public class Java2027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] a = scanner.next().split("\\.");
        scanner.close();

        int y = Integer.parseInt(a[0]);
        int m = Integer.parseInt(a[1]);
        int d = Integer.parseInt(a[2]);
        System.out.printf("%02d-%02d-%04d", d, m, y);
    }
}
