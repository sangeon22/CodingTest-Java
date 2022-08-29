package 코드업.코드업기초5_1;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Java1093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int li[] = new int[23];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            li[Integer.parseInt(st.nextToken())-1]++;
        }

        for (int i : li){
            bw.write(String.valueOf(i));
            bw.write(" ");
        }
        bw.close();
    }
}
