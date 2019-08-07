package com.ocaj.exam.tutorial.chapter4.primitives.arrays;

public class Array {

    /*
    simple array declaration of size 3 that will store int values
     The array must be initialized with new array does not matter if it is a object or a primitive type
     when you declare a new array you need to specify the size
     */
    int[] testScore =  new int[3];

    public void assignmentingAnArray(int position){
        testScore[0] = 98;
        testScore[1] = 100;
        testScore[2] = 72;

        int arraySize = testScore.length - 1;
       // System.out.println("choose a number between 0 and " + arraySize);


        if (position> arraySize) {
            System.out.println("this position "+ position +" doesn't exists " );
            System.out.println("choose a number between 0 and " + arraySize);

        } else {
            System.out.println("value of the position is " + testScore[arraySize]);
        }
    }

    public static void main(String[] args) {
        Array ar = new Array();

        ar.assignmentingAnArray(2);
    }




}
