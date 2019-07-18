package com.ocaj.exam.tutorial.chapter3.operators;

public class PrefixAndPostfixIncrementAndDecrementOperators {
    public static void main(String[] args) {
        int x, y = 0;

        //prefix operator

        System.out.println("Prefix operators");
        x =10;
        y = ++x;
        System.out.println("x :"+x +" y: "+y);

        x =10;
        y = --x;
        System.out.println("x :"+x +" y: "+y);
        System.out.println();
        //postfix operator

        System.out.println("Postfix operators");
        x= 10;
        y = x++;
        System.out.println("x :"+x +" y: "+y);x= 10;

        x= 10;
        y = x--;
        System.out.println("x :"+x +" y: "+y);
    }
}
