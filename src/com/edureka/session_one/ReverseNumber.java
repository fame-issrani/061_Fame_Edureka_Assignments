package com.edureka.session_one;

import java.util.Scanner;

/**
 * Created by fame.issrani on 2/14/17.
 */
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number to be reversed: ");
        int num=s.nextInt();
        int rev=0;
        while(num!=0){
             rev*=10;
             rev+= num%10;
            num/=10;
        }
        System.out.println(rev);
    }
}
