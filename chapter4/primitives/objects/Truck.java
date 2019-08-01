package com.ocaj.exam.tutorial.chapter4.primitives.objects;

public class Truck {


    //Here is a example of how  check whether an object is null
    public static void main(String[] args) {
        Truck truck = null;
        /*
        The best way to shun a NullPointerException is initialize your objects
        and use a conditional to check that may have been set to nul elsewhere in code.
         */
        if(truck == null){
            System.out.println("truck is null");
        }else
            System.out.println("truck isn't null");
    }
}
