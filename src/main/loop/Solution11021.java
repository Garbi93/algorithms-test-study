package main.loop;

import java.util.Scanner;

// A+B를 조금 더 아름답게 출력하는 문제
public class Solution11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Case #" + (i+1) + ": " + (a+b));
        }
    }
}
