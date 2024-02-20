package main.loop;

// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

import java.util.Scanner;

public class Solution2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String star = "";
        for (int i = 0; i < count; i++) {
            star = star + "*";
            System.out.println(star);
        }
    }
}
