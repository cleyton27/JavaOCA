package com.ocaj.exam.tutorial.chapter3.stringmethods;

public class EndsWith {
    public static void main(String[] args) {
        String pirateMessage = "  Buried Treasure Chest! ";

        /* Returns true as the reference string ends with the compared string
         */
        boolean b1 = pirateMessage.endsWith("Chest! ");
        System.out.println(b1);

    }
}
