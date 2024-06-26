package main.deepSolution1;

import java.util.Scanner;

public class Solution3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 동혁이가 갖고있는 체스 배열
        Integer[] chess = {1, 1, 2, 2, 2, 8};
        // 동형이 체스에서 입력 받은 것을 빼서 다시 넣어주기
        for (int i = 0; i < 6; i++) {
            chess[i] = chess[i] - sc.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            System.out.println(chess[i]);
        }

    }
}
