package 코드업.코드업기초4_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Java1073 {
    public static void main(String[] args) {
        int n = -1;
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);


        while (n != 0){
            n = scanner.nextInt();
            if(n != 0) list.add(n);
        }
        scanner.close();

        for (int i : list){
            System.out.println(i);
        }
    }
}
