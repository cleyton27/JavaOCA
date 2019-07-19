package com.ocaj.exam.tutorial.chapter3.stringmethods;

public class Length {
    public static void main(String[] args) {
        String pirateMessage = " Buried Treasure Chest! ";

        // Returns the string's length
        int i = pirateMessage.length();
        System.out.println(i);
    // Use of array's length attribute
        String[] strings = new String[3];
        System.out.println(strings.length);
    }
}
