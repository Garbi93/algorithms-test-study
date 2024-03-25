package main.oneDimenstionArray;

import java.util.Scanner;

// 배열 뒤집기 -> 배열 안에 있는 값을 뒤집는 문제
public class Solution10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 총 바구니 수
        int countBucket = sc.nextInt();

        // 총 변경 할 횟수
        int totalChange = sc.nextInt();

        // 바구니 에 들어있는 값 초기화
        int[] arrBucket = new int[countBucket];
        for (int i = 0; i < countBucket; i++) {
            arrBucket[i] = i + 1;
        }



        // 바구니 안에 담긴 공들 뒤집기
        for (int i = 0; i < totalChange; i++) {
            // 시작 바구니
            int startBucket = sc.nextInt();
            // 마지막 바구니
            int lastBucket = sc.nextInt();

            // 바구니 뒤집기
            for (int s = startBucket - 1, l = lastBucket - 1; s < l ; s++, l--) {
                int temp = arrBucket[s];
                arrBucket[s] = arrBucket[l];
                arrBucket[l] = temp;
            }
        }

        for (int i = 0; i < countBucket; i++) {
            System.out.print(arrBucket[i] + " ");
        }
    }
}