package com.edureka.session_one;

import java.util.Scanner;

/**
 * Created by fame.issrani on 2/14/17.
 */
 public class NumberInWords {


    public static void main(String[] args) {
        System.out.println("Enter The number : ");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        displayNumWords(num);

    }

    private static void displayNumWords(int num) {
        String[] numericArray={"ZERO","ONE","TWO","ThREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
        if(num<10){
            System.out.print(numericArray[num] + " ");
            return;
        }
        displayNumWords(num/10);
        displayNumWords(num%10);
    }


}
