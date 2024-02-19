package main.conditional;

import java.util.Scanner;

// 범위가 더 넓은 시간 계산 문제
public class Solution2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int plus = sc.nextInt();

        if (m + plus < 60) {
            m = m + plus;
        } else {
            if (h +((m + plus) / 60) >= 24) {
                h = h +((m + plus) / 60) - 24;
                m = (m + plus) % 60;
            } else {
                h = h +((m + plus) / 60);
                m = (m + plus) % 60;
            }
        }
        System.out.println(h + " " + m);
    }
}
