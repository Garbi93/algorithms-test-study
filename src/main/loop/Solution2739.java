package main.loop;

import java.util.Scanner;

// 구구단을 출력하는 문제

public class Solution2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(a + " * " + i + " = " + (a*i));
        }
    }
}
