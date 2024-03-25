package main.oneDimenstionArray;

import java.util.Scanner;

// 성적 조작하여 평균내기
public class Solution1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countNumber = sc.nextInt();

        double[] arrPoint = new double[countNumber];
        double maxNumber = 0;
        for (int i = 0; i < countNumber; i++) {
            arrPoint[i] = sc.nextByte();
            if (maxNumber < arrPoint[i]){
                maxNumber = arrPoint[i];
            }
        }

        for (int i = 0; i < countNumber; i++) {
            arrPoint[i] = arrPoint[i] / maxNumber * 100;
        }
        double sumNumber = 0;
        for (int i = 0; i < countNumber; i++) {
            sumNumber += arrPoint[i];
        }

        System.out.println(sumNumber / countNumber);

    }
}
