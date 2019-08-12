package com.ocaj.exam.tutorial.chapter5.methods;

public class MakingandCallingAMethod {

    public int findLowerValue(int number1, int number2){

        int result;

        if(number1<number2){
            result = number1;
        }else
            result = number2;

        return result;
    }

    public static void main(String[] args) {
        MakingandCallingAMethod mcm = new MakingandCallingAMethod();
        String msg = "The lower number is ";
        //We can store the method's return at a variable
        int result = mcm.findLowerValue(3,8);
        System.out.println(msg+result);
        System.out.println();
        
        System.out.println(msg+mcm.findLowerValue(4,0));

    }
}
