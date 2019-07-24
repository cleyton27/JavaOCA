package com.ocaj.exam.tutorial.chapter3.stringmethods;

public class ToLowerCase {

    public static void main(String[] args) {
        String pirateMessage = " Buried Treasure Chest! ";

        // this method returns the entire string as lowercase characters
        String lc = pirateMessage.toLowerCase();
        System.out.println(lc);
        System.out.println();
        System.out.println(pirateMessage);
    }
}
