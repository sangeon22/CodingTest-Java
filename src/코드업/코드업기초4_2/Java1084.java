package 코드업.코드업기초4_2;

import java.io.*;
import java.util.StringTokenizer;

public class Java1084 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        br.close();

        int total = 0;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    total++;
                    bw.write(String.valueOf(i));
                    bw.write(" ");
                    bw.write(String.valueOf(j));
                    bw.write(" ");
                    bw.write(String.valueOf(k));
                    bw.write(" ");
                    bw.newLine();
                }
            }
        }
        bw.write(String.valueOf(total));
        bw.close();
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        scanner.close();
//        int total = 0;
//
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < b; j++) {
//                for (int k = 0; k < c; k++) {
//                    total++;
//                    System.out.printf("%d %d %d\n", i, j, k);
//                }
//            }
//        }
//        System.out.println(total);
    }
}
