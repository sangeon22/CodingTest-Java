package 코드업.코드업기초3;

import java.util.Scanner;

public class Java1068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        scanner.close();
        
        if (i>=90 && i<=100) System.out.println("A");
        else if (i>=70 && i<=89) System.out.println("B");
        else if (i>=40 && i<=69) System.out.println("C");
        else if (i>=0 && i<= 39) System.out.println("D");
        else System.out.println("입력 오류");
    }
}
