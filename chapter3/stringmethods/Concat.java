package com.ocaj.exam.tutorial.chapter3.stringmethods;

public class Concat {
    public static void main(String[] args) {
        String pirateMessage = "  Buried Treasure Chest! ";
        // Returns the concatenated string
        String c  = pirateMessage.concat("Weigh anchor");
        System.out.println(c);
    }
}
