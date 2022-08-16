package 코드업.코드업기초2;

import java.util.Scanner;

public class Java1041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        scanner.close();

        System.out.printf("%c", c+1);
    }
}
