package 코드업.코드업기초2;

import java.util.Scanner;

public class Java1055 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        if (a == 1 || b == 1)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
