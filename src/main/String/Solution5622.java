package main.String;

import java.util.Scanner;

public class Solution5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputStr = sc.next();

        // 입력 받은 문자열을 쪼개 문자 배열 만들기
        String[] arrStr = inputStr.split("");

        // 입력 받은 문자열의 길이 만큼 숫자 배열 만들기
        Integer[] arrInt = new Integer[inputStr.length()];

        // 숫자 배열에 집어 넣을 숫자 초기화
        int arrInsertInt = 0;

        for (int i = 0; i < inputStr.length(); i++) {
            switch (arrStr[i]) {
                case "A" : case "B" :
                case "C":
                    arrInt[i] = 3;
                    break;
                case "D": case "E":
                case "F":
                    arrInt[i] = 4;
                    break;
                case "G": case  "H":
                case "I":
                    arrInt[i] = 5;
                    break;
                case "J": case "K":
                case "L":
                    arrInt[i] = 6;
                    break;
                case "M": case "N":
                case "O":
                    arrInt[i] = 7;
                    break;
                case "P": case "Q": case  "R":
                case "S":
                    arrInt[i] = 8;
                    break;
                case "T": case  "U":
                case "V":
                    arrInt[i] = 9;
                    break;
                case "W": case "X": case  "Y":
                case "Z":
                    arrInt[i] = 10;
                    break;
                default:
                    arrInt[i] = 2;
                    break;
            }
        }

        // 숫자 배열을 합칠 변수 선언및 초기화
        int sumInt = 0;

        for (int i = 0; i < inputStr.length(); i++) {
            sumInt += arrInt[i];
        }

        System.out.println(sumInt);

    }
}
