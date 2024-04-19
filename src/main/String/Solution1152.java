package main.String;

import java.util.Scanner;

// 몇개의 단어로 문자열이 조합 되어 있는지?
public class Solution1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열 입력 받기
        String inputStr = sc.nextLine();

        // 입력 받은 문자열을 공백으로 나누어 배열에 담기
        String[] arrayStr = inputStr.split(" ");

        // 공백을 포함시키지 않고 카운트 하기 위해 카운트 변수 선언
        int count = 0;

        for (int i = 0; i < arrayStr.length; i++) {
            if (!arrayStr[i].equals("")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
