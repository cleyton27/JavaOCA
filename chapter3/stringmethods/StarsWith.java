package com.ocaj.exam.tutorial.chapter3.stringmethods;

public class StarsWith {
    public static void main(String[] args) {
        String pirateMessage = "  Buried Treasure Chest! ";
        // Returns true as the reference string starts with the compared string
        boolean b1 = pirateMessage.startsWith("  Buried");
        System.out.println(b1);

        //Returns false as referenced string does not start with the compared string at location 8
        boolean b2 = pirateMessage.startsWith(" Discoverd");
        System.out.println(b2);


    }
}
