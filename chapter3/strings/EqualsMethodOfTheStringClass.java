package com.ocaj.exam.tutorial.chapter3.strings;

public class EqualsMethodOfTheStringClass {

    public static void main(String[] args) {
        String msg1 = "WALKE THE PLANK!";
        String msg2 = "WALKE THE PLANK!";
        String msg3 = ("WALKE THE PLANK!");
        String msg4 = new String("WALKE THE PLANK!");

        /* When comparing characters strings among separate strings,
        the equals metos should be used
         */

        System.out.println(msg1.equals(msg2));
        System.out.println(msg1.equals(msg3));
        System.out.println(msg1.equals(msg4));
        System.out.println(msg2.equals(msg3));
        System.out.println(msg3.equals(msg1));
        System.out.println(msg4.equals(msg3));

        System.out.println();


        //When comparing objects reference the == operator should be used
        String cmd = "Set Sail!";
        String command = cmd;
        System.out.println(cmd == command);
        System.out.println();

        /*
        !!!Warning
        Do not attempt compare characters sequence values of strings with the == operator.

         */
        String interjection1 = "Arrgh!";
        String interjection2 = "Arrgh!";
        //Avoid this one
        System.out.println(interjection1 == interjection2);
        System.out.println();
        //This one must be used when you want compare character sequence of strings
        System.out.println(interjection1.equals(interjection2));
    }
}
