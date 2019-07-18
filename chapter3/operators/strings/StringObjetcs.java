package com.ocaj.exam.tutorial.chapter3.operators.strings;

public class StringObjetcs {

    public static void main(String[] args) {
        /*
        String quote = "Dead Men Tell No Tales";
        System.out.println(quote.replace("No Tales", "Tales"));
        System.out.println(quote);
        */

        // quote1 is a reference no assignment string object
        String quote1;
        // assignment string object to the reference
        quote1 = "Ahoy matey";

        //Creating a string object with an empty string representation
        // quote2a is a reference variable
        String quote2a = new String();
        // Equivalent Statement
        String quote2b = new String("");

        // Creating object while using a constructor
        String quote4 = new String("Yo ho Ho!");
        System.out.println(quote4);

        // Creating a reference variable that  refers to a separete reference variable of a string object
        String quote5 = "You're welcome to my gold.  -- William kidd";
        String quote6 = quote5;
        System.out.println(quote6);

        // Assign a new string to an existing string reference variable
        String quote7 = "The treasure is in the sand";
        quote7 = "The treasure is between the rails";
        System.out.println(quote7);

    }
}
