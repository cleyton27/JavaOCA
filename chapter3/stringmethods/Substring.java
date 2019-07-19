package com.ocaj.exam.tutorial.chapter3.stringmethods;

public class Substring {
    public static void main(String[] args) {
        String pirateMessage = "  Buried Treasure Chest! ";

        //Returns the entire string starting at index 9
        String ss1 = pirateMessage.substring(9);
        System.out.println(ss1);
        //Returns the entire string at index 9
        String ss2 = pirateMessage.substring(9, 11);
        System.out.println(ss2);
        /*Produces runtime error
        String ss3 = pirateMessage.substring(9, 8);
        System.out.println(ss3);
*/
        //Returns a blank
        String ss4 = pirateMessage.substring(9, 9);
        System.out.println(ss4);

    }
}
