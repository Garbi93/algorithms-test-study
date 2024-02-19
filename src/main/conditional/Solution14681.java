package main.conditional;

import java.util.Scanner;

// 점이 어느 사분면에 있는지 알아내는 문제
public class Solution14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > 0 && b > 0) {
            System.out.println(1);
        } else if (a < 0 && b > 0) {
            System.out.println(2);
        } else if (a < 0 && b < 0) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
    }
}
