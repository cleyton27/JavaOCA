package com.ocaj.exam.tutorial.chapter3.stringmethods;

public class TrimMethod {
    public static void main(String[] args) {
        String pirateMessage = " Buried Treasure Chest! ";
        /*Trim method returns the entire string minus leading and trailing whitespace
        characters in relationship to the reference string object.

         */
        //The whitespace character corresponds to the Unicode character \u0020
        System.out.println(" ".equals("\u0020"));


        String t = pirateMessage.trim();

        System.out.println(pirateMessage);
        System.out.println(t);
    }
}
