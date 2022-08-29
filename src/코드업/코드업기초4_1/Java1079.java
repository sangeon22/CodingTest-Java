package 코드업.코드업기초4_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Java1079 {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        char c = 'a';
        while (c != 'q'){
            list.add(c = scanner.next().charAt(0));
        }
        scanner.close();

        for (char i : list){
            System.out.println(i);
        }
    }
}
