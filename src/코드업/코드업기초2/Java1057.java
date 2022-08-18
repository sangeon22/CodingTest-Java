package 코드업.코드업기초2;

import java.util.Scanner;

public class Java1057 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        if (a != b)
            System.out.println(0);
        else
            System.out.println(1);

    }
}
