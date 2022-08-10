package 코드업.코드업기초2;

import java.util.Scanner;

public class Java2024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        scanner.close();

        for (int i = 0; i < word.length(); i++) {
            System.out.printf("'%c'\n", word.charAt(i));
        }

    }
}
