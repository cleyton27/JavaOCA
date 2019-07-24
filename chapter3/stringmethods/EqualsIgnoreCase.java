package com.ocaj.exam.tutorial.chapter3.stringmethods;

public class EqualsIgnoreCase {
    public static void main(String[] args) {
        /*
        the method equalsIgnoreCase returns a boolean value after comparing
        two strings while ignoring case consideration
         */

        String pirateMessage = "  Buried Treasure Chest! ";
        //Compares "  Buried Treasure Chest! " with " Buried XXXXXXX Chest! "
        boolean b1 = pirateMessage.equalsIgnoreCase("  Buried TREASURE Chest! ");

        System.out.println(b1);


    }

}
