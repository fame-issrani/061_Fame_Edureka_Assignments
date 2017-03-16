package com.edureka.session_two;

//program for checking abstract keyword

abstract class Bike{
    abstract void run();
}
class Honda4 extends Bike{
    void run(){System.out.println("running safely..");}
    public static void main(String args[]){
        Bike obj = new Honda4();
        obj.run();
    }
}