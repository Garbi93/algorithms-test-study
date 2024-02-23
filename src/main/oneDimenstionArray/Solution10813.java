package main.oneDimenstionArray;

// 공 바꾸기

import java.util.Scanner;

public class Solution10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 총 바구니 갯수
        int countAllBucket = sc.nextInt();
        // 변경할 횟수
        int countChange = sc.nextInt();
        // 초기 바구니 선언
        int[] arrayBuket = new int[countAllBucket];
        // 초기 바구니 값 초기화
        for (int i = 0; i < countAllBucket; i++) {
            arrayBuket[i] = i+1;
        }

        // 바구니 값 바꾸기
        for (int i = 0; i < countChange; i++) {
            // 바구니 번호는 인덱스 보다 크기 때문에 -1 씩 해준다.
            int target1Bucket = sc.nextInt() - 1;
            int target2Bucket = sc.nextInt() - 1;
            // 잠시 저장할 공간
            int temSave = 0;

            // 변경 시작
            temSave = arrayBuket[target1Bucket];
            arrayBuket[target1Bucket] = arrayBuket[target2Bucket];
            arrayBuket[target2Bucket] = temSave;
            // 변경 끝
        }

        // 변경된 바구니 값들 출력
        for (int i = 0; i < countAllBucket; i++) {
            System.out.println(arrayBuket[i]);
        }
    }
}
