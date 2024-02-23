package main.oneDimenstionArray;

import java.util.Arrays;
import java.util.Scanner;

// 배열에 값을 쓰는 문제 -> 공넣기
public class Solution10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 총 바구니 갯수
        int allBuketCount = sc.nextInt();

        // 공을 몇줄에 걸쳐 던질 횟수
        int countThrowBall = sc.nextInt();

        // 바구니에 담긴 공의 갯수 초기화
        int[] arrayCountInBucket = new int[allBuketCount];

        for (int i = 0; i < countThrowBall; i++) {
            // 시작 바구니
            int startBucketNum = sc.nextInt();
            // 마지막 바구니
            int lastBuketNum = sc.nextInt();
            // 공 번호
            int ballNumber = sc.nextInt();
            for (int j = startBucketNum - 1; j <= lastBuketNum - 1; j++) {
                arrayCountInBucket[j] = ballNumber;
            }
        }

        for (int i = 0; i < allBuketCount; i++) {
            System.out.print(arrayCountInBucket[i] + " ");
        }

    }
}
