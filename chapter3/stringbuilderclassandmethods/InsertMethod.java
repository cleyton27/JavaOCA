package com.ocaj.exam.tutorial.chapter3.stringbuilderclassandmethods;

public class InsertMethod {

    public static void main(String[] args) {
        /*
        The method inserts the string representation of supplied data starting
        at specified location
         */
        StringBuilder mateyMessage;
        mateyMessage = new StringBuilder("Shiver Me Tim");

        // Prints out Shiver Me and Bricks!
        System.out.println(mateyMessage.length());
         System.out.println(mateyMessage.insert(13, " and Bricks"));
    }
}
