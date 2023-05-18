package com.bridglabz.PracticePrograme;

import sun.text.normalizer.Utility;

public class BasicCorePrograms {

    public class Flipcoin {

        public static void main(String[] args) {

            // INITIALIZATION
            int n, h_cnt = 0, t_cnt = 0;
            double heads, tails;
            Utility u = new Utility();

            // INPUT DATA
            System.out.print("enter no. of times you want to flip the coin: ");
            n = u.inputInteger();

            // COMPUTATION
            for (int j = 0; j < n; j++) {
                double random = Math.random();
                if (random < 0.5)
                    t_cnt++;
                else
                    h_cnt++;
            }

            heads = h_cnt / (double) n * 100;
            tails = t_cnt / (double) n * 100;
            System.out.println("Percentage of heads: " + heads + "%");
            System.out.println("Percentage of tails: " + tails + "%");

        }

    }
}



public class Main {

    public static void main(String[] args) {

        // year to be checked
        int year = 1900;
        boolean leap = false;

        // if the year is divided by 4
        if (year % 4 == 0) {

            // if the year is century
            if (year % 100 == 0) {

                // if year is divided by 400
                // then it is a leap year
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }

            // if the year is not century
            else
                leap = true;
        }

        else
            leap = false;

        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}