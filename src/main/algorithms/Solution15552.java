package main.algorithms;

import java.io.*;

public class Solution15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] num = br.readLine().split(" ");
            int a = Integer.parseInt(num[0]);
            int b = Integer.parseInt(num[1]);
            bw.write(String.valueOf(a + b));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
