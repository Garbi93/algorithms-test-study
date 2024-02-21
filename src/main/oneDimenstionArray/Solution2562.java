package main.oneDimenstionArray;

// 최댓값이 어디에 있는지 찾는 문제

import java.util.Scanner;

public class Solution2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayNumber = new int[9];
        int maxNumber = 0;
        int indexNumber = 0;
        for (int i = 0; i < 9; i++) {
            arrayNumber[i] = sc.nextInt();
        }

        for (int i = 0; i < 9; i++) {
            if (maxNumber < arrayNumber[i]) {
                maxNumber = arrayNumber[i];
                indexNumber = i + 1;
            }
        }
        System.out.println(maxNumber);
        System.out.println(indexNumber);
    }
}
