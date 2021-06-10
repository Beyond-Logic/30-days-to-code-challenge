package com.beyondLogic;

public class Day2 {

    //Day 2: Operators

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here

        double tip = (meal_cost * tip_percent) /100;

        double tax = (meal_cost * tax_percent) /100;

        double total_cost = meal_cost + tip + tax;

        long total_cost_longValue = Math.round(total_cost);

        int round_total_cost = (int) total_cost_longValue;

        System.out.println(round_total_cost);

    }

}
