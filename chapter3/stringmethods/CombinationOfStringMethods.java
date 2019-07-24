package com.ocaj.exam.tutorial.chapter3.stringmethods;

public class CombinationOfStringMethods {
    public static void main(String[] args) {
        //Is possible for methods to be chained together
        String msg = " Maroon the First Mate with a flagon of water and a pistol ";
        String msg2 = msg.replace("First Mate", "Quartermaster").substring(0,47)+".";
        System.out.println(msg2);
        System.out.println();
        System.out.println(msg);

    }
}
