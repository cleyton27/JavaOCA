package com.ocaj.exam.tutorial.chapter1.chapter2.statments;

public class IfElse {

    boolean b = true;
    boolean bValue = (b = true);
    // Evaluates to true

    public void trueOrFalse(){

        //This is statement will print TRUE if the value is true
        if(bValue)
            System.out.println("TRUE");
            //This is statement will print FALSE if the value is false
        else System.out.println("FALSE");

        // bVlaue receive the value false
        if (bValue = false)
            //If the value is true will print TRuE
            System.out.println("TRUE");
        //Else the print value will be FALSE
        else System.out.println("FALSE");

        //If the value is equal true TRUE will be printed
        if (bValue == false)
            System.out.println("TRUE");

        //Else the value printed will be FALSE
        else System.out.println("FALSE");

    }



}
