package 코드업.코드업기초2;

import java.util.Scanner;

public class Java1026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] time = scanner.next().split(":");
        scanner.close();

        if (time[1].equals("00")){
            System.out.print("0");
        }else {
            System.out.printf("%s", time[1]);
        }
    }
}

