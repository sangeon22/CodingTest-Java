package 코드업.코드업기초4_2;

import java.util.Scanner;

public class Java1082 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(16);
        scanner.close();


            for (int i = 1; i < 16 ; i++) {
                System.out.printf("%X*%X=%X\n", n, i, n*i);
            }
    }
}
