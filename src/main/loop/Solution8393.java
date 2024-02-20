package main.loop;

// 1부터 N까지의 합을 구하는 문제. 물론 반복문 없이 풀 수도 있습니다.

import java.util.Scanner;

public class Solution8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
