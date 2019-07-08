package com.ocaj.exam.tutorial.chapter2.statments;

public class WrapperBoolean {

    public void checkIt(){

        //Is possible initialize the object Boolean through of the constructor
        Boolean wrapperBoolean = new Boolean(false);
        // Here the primitive variable is assigned with the wrapper boolean
        boolean primitiveBoolean1= wrapperBoolean.booleanValue();

        if (wrapperBoolean)
            System.out.println("Works because of unboxing");
        else System.out.println("The value is false");

        System.out.println("This is all");
    }
}
