package main.oneDimenstionArray;

// 배열을 입력받고 X보다 작은 수를 찾는 문제

import java.util.Scanner;

public class Solution10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countAllNumber = sc.nextInt();
        int lowerThenNumber = sc.nextInt();

        int[] arrayNumbers = new int[countAllNumber];
        for (int i = 0; i < countAllNumber; i++) {
            arrayNumbers[i] = sc.nextInt();
        }

        for (int index : arrayNumbers) {
            if (index < lowerThenNumber) {
                System.out.println(index);;
            }
        }
    }
}
