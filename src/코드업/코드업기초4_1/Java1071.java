package 코드업.코드업기초4_1;

import java.util.Scanner;

public class Java1071 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            if (n==0){
                break;
            }
            System.out.println(n);
        }
        scanner.close();
    }
}
