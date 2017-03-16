package com.edureka.session_one;

import java.util.Scanner;

/**
 * Created by fame.issrani on 2/14/17.
 */
public class OddBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter First number :");
        int a =s.nextInt();
        System.out.println("Enter second number :");
        int b= s.nextInt();

        while(a<=b){
            if(a%2==1){
                System.out.print(a+" ");
                a+=2;
            }else{
                a++;
            }

        }
    }
}
