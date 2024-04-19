package main.String;

import java.util.Scanner;

// 문자열 반복
public class Solution2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 총 문자를 받을 횟수
        int inputTime = sc.nextInt();

        for (int i = 0; i < inputTime; i++) {
            // 받은 문자를 반복할 횟수
            int repeatStr = sc.nextInt();

            // 문자열 받기
            String inputStr = sc.next();

            // 문자열을 분리 하여 Array 에 담기
            String[] arrayStr = inputStr.split("");

            // 분리 한것을 반복 하여 출력 하기
            for (int j = 0; j < arrayStr.length; j++) {
                for (int k = 0; k < repeatStr; k++) {
                    System.out.print(arrayStr[j]);
                }
            }
            System.out.println();
        }

    }
}
