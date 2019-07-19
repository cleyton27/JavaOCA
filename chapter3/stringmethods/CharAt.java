package com.ocaj.exam.tutorial.chapter3.stringmethods;

public class CharAt {

    public static void main(String[] args) {

        String pirateMessage = " Buried Treasure Chest! ";
        //Char method returns a primitive char from a specific ind index value in relationship to the referenced string object
        char c1 = pirateMessage.charAt(0);
        System.out.println(c1);
        char c2 = pirateMessage.charAt(4);
        System.out.println(c2);
        char c3 = pirateMessage.charAt(7);
        System.out.println(c3);
        char c4 = pirateMessage.charAt(8);
        System.out.println(c4);
        char c5 = pirateMessage.charAt(12);
        System.out.println(c5);
        char c6 = pirateMessage.charAt(9);
        System.out.println(c6);
    }
}
