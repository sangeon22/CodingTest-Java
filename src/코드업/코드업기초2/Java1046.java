package 코드업.코드업기초2;

import java.util.Scanner;

public class Java1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        System.out.println(a+b+c);
        System.out.println(String.format("%.1f",(float) (a+b+c)/3));
    }
}
