package com.ocaj.exam.tutorial.chapter5.methods;

import java.util.Scanner;

public class OverLoadingAMethod {
    /*when several methods share the same identifier, but have different parameter
    lists,  the method are said to be overload. The parameter list may comprise more
    or fewer parameters than other methods, or different types.
     */

    public int findLowerValue(int number1, int number2){

        int result;

        if(number1<number2) result = number1;
        else
            result = number2;

        return result;
    }

    public double findLowerValue(double number1, double number2){

        double result;

        if(number1<number2){
            result = number1;
        }else
            result = number2;

        return result;
    }

    public String findLowerValue(){
        /**
         * This method receives two values by user and compare them to know how is the lower
         * and return a String value concatenated with a double value.
         */
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("add a number");

        x = sc.nextInt();
        System.out.println("add another number");

        y = sc.nextInt();


        double result = findLowerValue(x,y);

        return "the lower number is "+result;
    }


    public void logInfo(String message, int errorNumber){
        System.out.println("Error: "+ errorNumber + " | "+ message);
    }

    public void logInfo(String message){
        logInfo(message,1);
    }

    public static void main(String[] args) {
        OverLoadingAMethod om = new OverLoadingAMethod();
      //  String result =  om.findLowerValue();
        //System.out.println(result);

        om.logInfo("First log message", -299);
        om.logInfo("Second log message");
    }

}

