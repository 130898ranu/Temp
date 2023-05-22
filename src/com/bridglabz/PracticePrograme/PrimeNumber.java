package com.bridglabz.PracticePrograme;

import java.util.Scanner;

public class PrimeNumber {

    public static void primeNumber(){
        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int count=0;
        for(int i=2;i<=number-1;i++){
            if(number%i==0){
                count=count+1;
            }
        }
        if(count>0){
            System.out.println(number+": is not a prime number.");
        }else{
            System.out.println(number+" : is a prime number.");
        }
    }
}
}
