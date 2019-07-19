package com.ocaj.exam.tutorial.chapter3.stringmethods;

public class IndexOf extends CharAt {

    public static void main(String[] args) {
        String pirateMessage = "  Buried Treasure Chest! ";

        /* indexOf method returns int values representing the index
        of character or string in relationship to the referenced string object

         */

        // Returns  the integer 3 as it  the first 'u' in the string
        int i1 = pirateMessage.indexOf('u');
        System.out.println(i1);
        //Returns the integer 13 as it  starts at location 13 in the string
        int i2 = pirateMessage.indexOf('u', 9);
        System.out.println(i2);
        // Returns the integer -1 as there is no Treasure string on or past location 10
        int i3 = pirateMessage.indexOf("sure");
        System.out.println(i3);
        // Returns the integer -1 as there is no Treasure string on or past location 10
        int i4 = pirateMessage.indexOf("Treasure", 10);
        System.out.println(i4);
        int i5 = pirateMessage.indexOf("u", 100);
        System.out.println(i5);

    }
}
