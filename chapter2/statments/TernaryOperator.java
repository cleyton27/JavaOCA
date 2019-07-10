package com.ocaj.exam.tutorial.chapter2.statments;

public class TernaryOperator {

    public void tenaryOperator(){

        int x = -5;
        //aboluteValue recieves x value if x is greater than 0
        //if not absoluteValue recieves -x
        int absoluteValue = x >0 ? x: -x;

        System.out.println(absoluteValue);

    }

    //This method does the same thing that the tenaryOperator method
    public void ifElseOperators(){
        int x = -5;

        int absoluteValue;
        if(x>0)
        System.out.println((absoluteValue = x)+ " Inside if");
        else
            System.out.println((absoluteValue = -x)+" Inside else");
        System.out.println(absoluteValue);


    }


}
