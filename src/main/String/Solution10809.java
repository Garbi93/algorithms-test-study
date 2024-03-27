package main.String;

import java.util.Scanner;

// 알파벳 찾기
public class Solution10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        String[] arrInputStrings = inputString.split("");

        int[] arrIsThereValue = new int[26];
        for (int i = 0; i < arrIsThereValue.length; i++) {
            arrIsThereValue[i] = -1;
        }

        for (int i = 'a'; i <= 'z'; i++) {
            for (int j = 0; j < arrInputStrings.length; j++) {
                if (arrInputStrings[j].equals(String.valueOf((char)i))) {
                    arrIsThereValue[i - 'a'] = j;
                    // 처음 만난 곳에서 탈출 시키기
                    break;

                }
            }
        }
        for (int i = 0; i < arrIsThereValue.length; i++) {
            System.out.print(arrIsThereValue[i] + " ");
        }

    }
}
