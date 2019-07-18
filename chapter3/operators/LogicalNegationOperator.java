package com.ocaj.exam.tutorial.chapter3.operators;

public class LogicalNegationOperator {
    public static void main(String[] args) {
        //Negation operator invert the value as the example bellow

        // Prints true
        System.out.println(!false);
        // Prints false
        System.out.println(!true);
        // Prints true
        System.out.println(!!true);
        // Prints false
        System.out.println(!!!true);
        // Prints true
        System.out.println(!!!!true);
    }
}
