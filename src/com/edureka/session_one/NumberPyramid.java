package com.edureka.session_one;

import java.util.Scanner;

/**
 * Created by fame.issrani on 2/14/17.
 */
public class NumberPyramid {

    public static void main(String[] args) {
        System.out.println("Enter the number rows for number sequence : ");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        for(int row=1;row<=num;row++){
            for(int seq=1;seq<=row;seq++){
                System.out.print(seq+ " ");
            }
            System.out.println();
        }
    }
}
