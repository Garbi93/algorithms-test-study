package main.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// TODO : 이것도 해결 해야함
public class Solution11718 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> listStr = new ArrayList<>();

        if (!sc.next().equals("")) {
            for (int i = 0; i < listStr.size(); i++) {
                listStr.add(sc.next());
            }
        }
        for (int i = 0; i < listStr.size(); i++) {
            System.out.println(listStr.get(i));
        }

    }
}
