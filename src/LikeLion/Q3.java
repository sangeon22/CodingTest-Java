package LikeLion;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            while (true) {
                Scanner scanner = new Scanner(System.in);
                System.out.printf("숫자 %d : ", i + 1);
                try {
                    arr[i] = scanner.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("[입력오류] : 숫자로 입력해주세요.");
                }
            }

        }


        Arrays.sort(arr);
        String s = Arrays.toString(arr).replace("[", "").replace("]", "");
        System.out.print("결과 : " + s);

    }
}
