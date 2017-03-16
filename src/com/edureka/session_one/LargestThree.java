package com.edureka.session_one;

/**
 * Created by fame.issrani on 2/14/17.
 */
public class LargestThree {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=3;
        int largest;

        if(a>b && a>c){
            largest=a;
        }else if (b>a && b>c){
            largest=b;
        }else {
            largest=c;
        }
        System.out.println("Largest : " + largest);
    }
}
