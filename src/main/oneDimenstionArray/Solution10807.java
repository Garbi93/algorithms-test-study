package main.oneDimenstionArray;

import java.util.ArrayList;
import java.util.Scanner;

// 배열을 입력 받고 v 를 찾는 문제

public class Solution10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countNumber = sc.nextInt();

        ArrayList<Integer> arrayNumber = new ArrayList<>(countNumber);
        for (int i = 0; i < countNumber; i++) {
            arrayNumber.add(sc.nextInt());
        }

        int findNumber = sc.nextInt();
        int count = 0;

        for(int index : arrayNumber) {
            if(index == findNumber) {
                ++count;
            }
        }
        System.out.println(count);
    }
}
