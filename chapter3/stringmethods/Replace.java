package com.ocaj.exam.tutorial.chapter3.stringmethods;

public class Replace {
    public static void main(String[] args) {
        String pirateMessage = "  Buried Treasure Chest! ";
        //Original String
        System.out.println(pirateMessage);
        // Returns the string with all characters 'B' replaced with 'J'
        String s =  pirateMessage.replace('B','J');
        System.out.println(s);

        String s1 =  pirateMessage.replace(' ','X');
        System.out.println(s1);
    }
}
