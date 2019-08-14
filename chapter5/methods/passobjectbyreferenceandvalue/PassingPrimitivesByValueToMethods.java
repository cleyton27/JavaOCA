package com.ocaj.exam.tutorial.chapter5.methods.passobjectbyreferenceandvalue;

public class PassingPrimitivesByValueToMethods {

    int value =1;

    /*
    When a primitive is used as an argument, a copy of the value is made and
    provided  to method. If the method sets the value of the parameter to different
    value, it has no effect on the variable that was passed to the method.
     */
    void addTwo(int value){
        System.out.println("Parameter: "+value);
        value = value+ 2;
        System.out.println("Leaving method: value = "+ value);
    }

    public static void main(String[] args) {

        PassingPrimitivesByValueToMethods ppvm= new PassingPrimitivesByValueToMethods();
        ppvm.addTwo(ppvm.value);
        System.out.println();
        System.out.println("After method call: value ="+ ppvm.value);


    }
}
