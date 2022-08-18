package 코드업.코드업기초2;

import java.util.Scanner;

public class Java1053 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        scanner.close();

        System.out.println(i == 0 ? 1 : 0);
    }
}
