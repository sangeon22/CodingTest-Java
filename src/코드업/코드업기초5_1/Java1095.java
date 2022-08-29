package 코드업.코드업기초5_1;


import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java1095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int li[] = new int[n];
        int i = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        while (st.hasMoreTokens()){
            li[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        Arrays.sort(li);
        bw.write(String.valueOf(li[0]));
        bw.close();
    }
}
