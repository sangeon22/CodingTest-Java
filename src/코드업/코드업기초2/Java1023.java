package 코드업.코드업기초2;

import java.util.Scanner;

public class Java1023 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] a = s.next().split("\\.");
        s.close();
        System.out.printf("%s\n%s",a[0],a[1]);

    }
}
