package main.loop;

// A+B를 바로 위 문제보다 아름답게 출력하는 문제

import java.util.Scanner;

public class Solution11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 1; i <= count; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a+b));
        }
    }
}
