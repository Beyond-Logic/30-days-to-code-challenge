package com.beyondLogic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int consecutive = 0;
        String baseConverter = Integer.toBinaryString(n);
        String[] str = baseConverter.split("0");
        for (int i = 0; i < str.length; i++) {
            if (consecutive < str[i].length()) {
                consecutive = str[i].length();
            }
        }
        System.out.println(consecutive);
        bufferedReader.close();


    }
}
