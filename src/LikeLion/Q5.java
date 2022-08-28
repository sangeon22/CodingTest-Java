package LikeLion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q5 {
    public static boolean prime(int n){
        for (int i = 2; i < (int)Math.sqrt(n) +1; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = -1;
        int i = 1;
        StringBuilder answer = new StringBuilder();

        ArrayList<Integer> total = new ArrayList<Integer>();

        System.out.println("[안내] 0을 입력하시면 입력이 종료 됩니다.");
        while (n != 0){
            System.out.printf("숫자 %d : ", i);
            try {
                Scanner scanner = new Scanner(System.in);
                n = scanner.nextInt();
                i ++;
                if (total.contains(n)){
                    System.out.println("[입력오류] : 이미 입력된 숫자 입니다.");
                }else {
                    if (prime(n) && n!=0){
                        total.add(n);
                    }
                }
            }catch (Exception e){
                System.out.println("[입력오류] : 숫자로 입력해주세요.");
            }
        }
        Collections.sort(total);
        for( int a : total){
            answer.append(a).append(", ");
        }
        System.out.print("결과 : " + answer.substring(0, answer.length()-2));
    }
}
