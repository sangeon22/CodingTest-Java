package 코드업.코드업기초2;

import java.util.Scanner;

public class Java1059 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();

        System.out.println(~a);
    }
}
