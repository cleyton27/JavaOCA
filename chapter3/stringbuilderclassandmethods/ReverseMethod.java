package com.ocaj.exam.tutorial.chapter3.stringbuilderclassandmethods;

public class ReverseMethod {
    public static void main(String[] args) {
        StringBuilder r  = new StringBuilder("part");
        r.reverse();
        // Prints out "It's a trap"
        System.out.println("It's a "+r+"!" );
    }
}
