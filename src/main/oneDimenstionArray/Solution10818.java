package main.oneDimenstionArray;

// 최솟값과 최댓값을 찾는 문제

import java.util.Scanner;

public class Solution10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countAllNumber = sc.nextInt();
        int lowerNumber = 0;
        int maxNumber = 0;

        int[] arrayNumber = new int[countAllNumber];
        for (int i = 0; i < countAllNumber; i++) {
            arrayNumber[i] = sc.nextInt();
        }
        lowerNumber = arrayNumber[0];
        maxNumber = arrayNumber[0];

        for (int index : arrayNumber) {
            if (lowerNumber > index) {
                lowerNumber = index;
            }
            if (maxNumber < index) {
                maxNumber = index;
            }
        }
        System.out.println(lowerNumber + " " + maxNumber);
    }
}
