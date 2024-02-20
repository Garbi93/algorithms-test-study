package main.loop;

// 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다. 일치하지 않는다면 No를 출력

import java.util.Scanner;

public class Solution25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPrice = sc.nextInt();
        int countProduct = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < countProduct; i++) {
            int price = sc.nextInt();
            int count = sc.nextInt();

            sum = sum + (price * count);
        }
        if (sum == totalPrice) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
