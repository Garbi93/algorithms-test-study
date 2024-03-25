package main.String;

import java.util.Scanner;
// 문자열의 합
public class Solution11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 들어가는 숫자의 길이
        int lengthNumber = sc.nextInt();

        // 들어온 숫자를 문자열로 읽기
        String inputNumber = sc.next();

        // 문자열로 들어온 숫자를 쪼개주기
        String[] arrSliceNumber = inputNumber.split("");

        // 합 저장 변수 선언
        int sum = 0;
        // 숫자 타입 배열 선언
        int[] arrNumbers = new int[lengthNumber];
        for (int i = 0; i < lengthNumber; i++) {
            arrNumbers[i] = Integer.parseInt(arrSliceNumber[i]);
            sum += arrNumbers[i];
        }
        System.out.println(sum);
    }
}
