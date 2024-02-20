package main.loop;

// 입력이 끝날 때까지 A+B를 출력하는 문제. EOF에 대해 알아 보세요.

import java.util.Scanner;

public class Solution10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
        }
    }
}
