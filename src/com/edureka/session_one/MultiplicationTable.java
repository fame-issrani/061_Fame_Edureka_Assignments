package com.edureka.session_one;

import java.util.Scanner;

/**
 * Created by fame.issrani on 2/14/17.
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number to get its multiplication table : ");
        int num=s.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
}
