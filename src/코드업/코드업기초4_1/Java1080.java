package 코드업.코드업기초4_1;

import java.util.Scanner;

public class Java1080 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int total = 0;
        int i = 1;
        while (total < n) {
            total += i;
            i++;
        }
        System.out.println(i-1);
    }
}
