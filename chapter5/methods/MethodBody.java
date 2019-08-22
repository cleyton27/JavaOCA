package com.ocaj.exam.tutorial.chapter5.methods;

public class MethodBody {

    /* The method body is the main part of the method and contains all the code
    tha makes up the functionality of the method.
     */

    public int sum(int num1, int num2){
        int sum  = num1+num2;
        return sum;
    }

    //This method does not return nothing, just print the parameter
    public void printString(String stringToPrint){
        System.out.println(stringToPrint);
    }

    public static void main(String[] args) {
        MethodBody mb = new MethodBody();
        mb.printString("Hey you");
    }
}
