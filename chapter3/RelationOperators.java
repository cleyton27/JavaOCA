package com.ocaj.exam.tutorial.chapter3;

public class RelationOperators {

    public static void main(String[] args) {
        //returns true as 1 is less than 2
        boolean b1 = 1<2;
        System.out.println(b1);
        //returns false as 3 is not than 2
        boolean b2 = 3<2;
        System.out.println(b2);
        // returns true as 3 is greater than 2
        boolean b3 = 3>2;
        System.out.println(b3);
        // returns false as 1 is not greater than 2
        boolean b4 = 1>2;
        // returns true as 2 is less or equal to 2
        System.out.println(b4);
        boolean b5 = 1<=2;
        // returns false as 3 is not less than or equal to 2
        System.out.println(b5);
        boolean b6 = 3<=2;
        System.out.println(b6);
        // returns true as 3 is grater than or equal to 3
        boolean b7 = 3>=2;
        System.out.println(b7);
        // returns false as 2 is not greater than or equal to 3
        boolean b8 = 2>=3;
        System.out.println(b8);

    }
}
