package 코드업.코드업기초4_1;

import java.util.Scanner;

public class Java1076 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char n = scanner.next().charAt(0);
        char a = 'a';

        do {
            System.out.println(a);
            a++;
        }while (n >= a);

        scanner.close();
    }
}
