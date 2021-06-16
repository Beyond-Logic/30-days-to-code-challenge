package com.beyondLogic;

public class Day9 {
    /*
     * Complete the 'factorial' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */
    public static int factorial(int n) {
        // Write your code here
        if(n <= 1){
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
