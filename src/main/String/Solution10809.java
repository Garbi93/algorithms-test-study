package main.String;

import java.util.Scanner;

// TODO : 알파벳 찾기 풀이중 막힘
public class Solution10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        String[] arrInputStrings = inputString.split("");

        int[] arrIsThereValue = new int[26];
        for (int i = 0; i <= arrIsThereValue.length; i++) {
            arrIsThereValue[i] = -1;
        }

        for (int i = 'a'; i <= 'z'; i++) {
            for (int j = 0; j < arrInputStrings.length; j++) {
//                System.out.println(arrInputStrings[j]);
//                System.out.println((char)i);
//                System.out.println(arrInputStrings[j].equals(String.valueOf((char)i)));
                if (arrInputStrings[j].equals(String.valueOf((char)i))) {
                    arrIsThereValue[i] = j;
                }
            }
        }
        for (int i = 0; i <= 26; i++) {
            System.out.println(arrIsThereValue[i] + " ");
        }

    }
}
