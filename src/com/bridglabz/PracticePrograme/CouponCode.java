package com.bridglabz.PracticePrograme;

public class CouponCode {
    public static void coupneCode(){
//    Scanner sc=new Scanner(System.in);
//    String str=sc.next().toString();
        char[] ch="123456789 abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        int max=4555;
        int random= (int)(Math.random()*max);
        StringBuffer sb=new StringBuffer();
        while (random>0)
        {
            sb.append(ch[random % ch.length]);
            random=random/ch.length;
        }
        String cpCode=sb.toString();
        System.out.println("Coupon Code: "+cpCode);
    }
}
}
