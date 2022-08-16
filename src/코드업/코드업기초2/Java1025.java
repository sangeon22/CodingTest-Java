package 코드업.코드업기초2;

import java.util.Scanner;

public class Java1025 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] a = s.next().split("");
        s.close();

        System.out.printf("[%s0000]\n", a[0] );
        System.out.printf("[%s000]\n", a[1] );
        System.out.printf("[%s00]\n", a[2] );
        System.out.printf("[%s0]\n", a[3] );
        System.out.printf("[%s]\n", a[4] );
    }
}
