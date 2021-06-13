package com.beyondLogic;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String s;
        for (int i = 0; i < number; i++) {
            s = input.next();
            for (int k = 0; k < s.length(); k++) {
                if(k % 2 == 0){
                    System.out.print(s.charAt(k));
                }
            }
            System.out.print(" ");
            for (int j = 0; j < s.length(); j++) {
                if(j % 2 == 1){
                    System.out.print(s.charAt(j));
                }
            }

            System.out.println(" ");

        }
    }
}
