package com.ocaj.exam.tutorial.chapter3;

public class EqualityOperators {
    public static void main(String[] args) {
        int value = 12;
        // boolean comparison , prints true
        System.out.println(true == true);
        // char comparison, prints false
        System.out.println('a' != 'a');
        // byte comparison, prints true
        System.out.println((byte)value == (byte)value);
        // short comparison, prints false
        System.out.println((short)value != (short)value);
        // integer comparison, prints true
        System.out.println(value == value);
        // float comparison, prints true
        System.out.println(12F == 12f);
        // double comparison, prints false
        System.out.println(12D != 12d);

        //Comparison between objects

        System.out.println();
        Object a = new Object();
        Object b = new Object();
        Object c = b;
        // Prints false, different reference
        System.out.println(a == b);
        // Prints false, different reference
        System.out.println(a ==c);
        // Prints true, same reference
        System.out.println(b == c);
    }
}
