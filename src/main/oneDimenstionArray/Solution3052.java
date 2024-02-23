package main.oneDimenstionArray;

import java.util.Arrays;
import java.util.Scanner;

// 배열을 활용하여 서로 다른 값의 개수를 찾는 문제 -> 나머지
public class Solution3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 나머지 가 다른 갯수 셀 변수 하나 선언 -> 무조건 1개는 있으니 1로 초기화
        int countDiffNumber = 1;

        // 10개만 존재하는 배열 하나 생성
        int[] arrayNumber = new int[10];

        // 입력 받은 수를 42 로 나눈 나머지 값으로 배열 초기화 시키기
        for (int i = 0; i < 10; i++) {
            int inputNumber = sc.nextInt();
            arrayNumber[i] = inputNumber % 42;
        }

        // 배열에서 중복 제거 하기
        arrayNumber = Arrays.stream(arrayNumber).distinct().toArray();

        // 중복 제거된 배열 길이 던지기
        System.out.println(arrayNumber.length);

    }
}
