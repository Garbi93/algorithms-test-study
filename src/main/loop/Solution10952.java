package main.loop;

// 0 0이 들어올 때까지 A+B를 출력하는 문제

import java.util.Scanner;

public class Solution10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int b = 1;
        while (a + b != 0) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (a + b != 0) {
                System.out.println(a + b);
            }
        }
    }
}
