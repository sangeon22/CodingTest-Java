package LikeLion;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        StringBuilder answer = new StringBuilder();
        int n = -1;
        int i = 1;

        System.out.println("0을 입력하시면 입력이 종료 됩니다.");
        while (n != 0){
            System.out.printf("숫자 %d : ", i);
            try {
                Scanner scanner = new Scanner(System.in);
                n = scanner.nextInt();
                i += 1;
                if(n != 0){
                    answer.append(n).append(", ");
                }
            }catch (Exception e){
                System.out.println("[입력오류] : 숫자로 입력해주세요.");
            }
        }
        System.out.print(answer.substring(0, answer.length()-2));
    }
}
