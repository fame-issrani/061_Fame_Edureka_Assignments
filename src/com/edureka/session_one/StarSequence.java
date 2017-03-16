package com.edureka.session_one;

import java.util.Scanner;

/**
 * Created by fame.issrani on 2/14/17.
 */
public class StarSequence {

    public static void main(String[] args) {
        System.out.println("Enter the number rows for star sequence : ");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        for(int row=1;row<=num;row++){
            for(int stars=1;stars<=row;stars++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }

}
