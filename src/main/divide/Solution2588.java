package main.divide;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 정수 타입 데이터를 분리하여 배열에 집어 넣기

public class Solution2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int sum = A * B;
        List<Integer> listB = new ArrayList<>();
         while (B > 0) {
             int b = B % 10;
             System.out.println(b);
             listB.add(b);
             B = B / 10;
         }

        for (int i = 0; i < listB.size(); i++) {
            System.out.println(A * listB.get(i));
        }
        System.out.println(sum);
    }
}
