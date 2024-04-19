package main.String;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

// 두 상수를 입력 받아 뒤집은 후 어느것 이 큰지?
public class Solution2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1번 입력
        String input1 = sc.next();
        // 2번 입력
        String input2 = sc.next();

        // 뒤집힌 것을 저장할 변수
        String rev1 = "";
        String rev2 = "";

        // 문자열을 분리하기
        String[] arrInput1 = input1.split("");
        String[] arrInput2 = input2.split("");


        // 분리한 것을 뒤집어 저장
        for (int i = 0; i < arrInput1.length; i++) {
            rev1 += arrInput1[arrInput1.length -1 - i];
        }

        for (int i = 0; i < arrInput2.length; i++) {
            rev2 += arrInput2[arrInput2.length -1 - i];
        }

        // 삼항 연산자를 사용 하여 큰 것을 출력 변수에 저장
        String printStr = parseInt(rev1) > parseInt(rev2) ?  rev1 :  rev2;

        // 출력
        System.out.println(printStr);
    }
}
