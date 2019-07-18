package com.ocaj.exam.tutorial.chapter3.operators;

public class OperatorPrecedence {

    public static void main(String[] args) {
        int p1 = 1; int p2 = 5; int p3 = 10; int p4 =25;
        // Same precedence
        System.out.println(p1+p2-p3);
        System.out.println();
        // Lower, followed by higher precedence
        // When  the operator not have the same precedence the Higher operator is evaluated first
        System.out.println(p1+p2*p3);

        /*When an expression includes parentheses, operator precedence is overridden
        Parentheses overriding precedence
         */
        System.out.println();
        System.out.println((p1+p2)* p3);

        /* When an expression has multiple sets of parentheses, the operator associated with the innermost
        parentheses is valuated first
         */
        System.out.println();
        System.out.println((p1*(p2+p3))-p4);
    }
}
