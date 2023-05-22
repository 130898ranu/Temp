package com.bridglabz.PracticePrograme;

import java.util.Scanner;

public class PerfectNumber {
    public static void perfectNumber(){
        int sum=0;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        for(int i=1;i<number;i++){
            if(number%i==0){
                sum=sum+i;
            }
        }
        if(number==sum) {
            System.out.println(number + ": Perfect number");
        }
        else{
            System.out.println("Not a perfect number");
        }
    }
}
}
