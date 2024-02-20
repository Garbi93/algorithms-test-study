package main.loop;

// 코딩 공부를 잘 하여 이렇게 long long long long...을 칠판에 적는 일이 없도록 합시다.

import java.util.Scanner;

public class Solution25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = (sc.nextInt()/4);

        String countLong = "";
        for (int i = 0; i < a; i++) {
            countLong = countLong + "long ";
        }
        System.out.println(countLong + "int");
    }
}
