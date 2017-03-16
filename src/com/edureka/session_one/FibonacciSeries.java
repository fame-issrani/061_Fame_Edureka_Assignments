package com.edureka.session_one;

import java.util.Scanner;

/**
 * Created by fame.issrani on 2/14/17.
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println(" Enter upper limit of elements in fibonacci to be generated");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" "+b+" ");
        for(int i=3;i<=num; i++){
            int next=a+b;
            a=b;
            b=next;
            System.out.print(next +" ");
        }

    }

}



