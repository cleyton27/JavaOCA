package com.ocaj.exam.tutorial.chapter4.primitives;

public class Primitives {


    public static void main(String[] args) {

        /*
        When primitives are used in the body of a method, they most be
        assigned a value before being used. If they are not assigned a value, a compiler
        time error will be generated as a example bellow

         int gallons;
         System.out.println("Gallons: "+gallons);

         */

        /*
        Primitives  that are declared as instance variable get a assigned a default value of 0 or false
        if they are boolean
         */

        int gallons = 13;
        System.out.println("Gallons: "+gallons);
        System.out.println();

         //***************************************


        //Boolean primitive is used to store a value true or false
        boolean hasTurboCharger = true;
        System.out.println("Turbo Charger: "+hasTurboCharger);

        //When a char is set with a character in code, single quotes should be used 'Y' for example

        char answer = 'Y';
        char answer1 = 'E';
        char answer2 = 'S';
        char charArray[] = {answer, answer1,answer2};
        System.out.println(charArray);

        /*A byte is a Java primitive that is normally used to store small,
        signed numbers up to 1 byte in size.
        */

        // maximum store value is 127
        byte passengers = 127; //implicit cast from integer to byte
        byte doors = (byte) 2; // explicit cast from integer to byte

        /* A short is Java primitive used for small numbers
         */
        //maximum value 32767 minimum is -32768
        short unladenWeightInLbs = 32766;

        //An int is used to store most whole numbers

        char cylinders = '\u0010';
        int cyl = cylinders;
        byte wheelbase = 90;
        int wBase = wheelbase;
        short horsepower = 250;
        int hPower = horsepower;
        // floats must be explicitly casted
        int length = (int) 151.5F;
        //doubles must be explicitly casted
        int powerToWeightRatio =(int) 405.1D;

        //A long is a Java primitive used for whole numbers that are than int can store

        long mustangBingResults = 146000000L;


        //A float primitive is used to store decimal values.
        float currentBid = 80200.99F;
        float openingBid = 2000.00f;

        // double primitive is used to store large decimal values.

        double leafSpringCobraEngine = 4.7D;


    }
}
