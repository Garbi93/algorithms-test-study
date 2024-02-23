package main.oneDimenstionArray;

// 과제 안 내신 분...?

import java.util.Scanner;

public class Solution5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 모든 출석번호 초기화하기 -> 총 학생 수는 30 명에 28명만 제출했다는 전제로 시작한다.
        int[] attendNumber = new int[30];
        for (int i = 0; i < 30; i++) {
            // 출석번호 정렬하기
            attendNumber[i] = i + 1;
        }

        // 제출한 학생들은 0 으로 만들기
        for (int i = 0; i < 28; i++) {
            // 제출한 학생 번호 에서 -1 해서 인덱스 접근하기
            int student = sc.nextInt() - 1;

            // 제출한 학생 index의 값 = 0 으로 변경
            attendNumber[student] = 0;
        }

        // 0이 아닌 학생들만 출력 하기
        for (int i = 0; i < 30; i++) {
            if (attendNumber[i] != 0){
                System.out.println(attendNumber[i]);
            }
        }

    }
}
