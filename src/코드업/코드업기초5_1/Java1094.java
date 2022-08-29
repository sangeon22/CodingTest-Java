package 코드업.코드업기초5_1;

import java.io.*;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Java1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int li[] = new int[n];
        int reverser_li[] = new int[n];
        int i = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        while (st.hasMoreTokens()) {
            li[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        for (int j = 0; j < li.length; j++) {
            reverser_li[li.length-1-j] = li[j];
        }

        for (int k : reverser_li) {
            bw.write(String.valueOf(k));
            bw.write(" ");
        }

        bw.close();
    }
}
