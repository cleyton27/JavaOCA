package com.ocaj.exam.tutorial.chapter4.primitives.objects;

public class Truck {


    //Here is a example of how  check whether an object is null
    public static void main(String[] args) {
        Truck truck = null;
        //
        if(truck == null){
            System.out.println("truck is null");
        }else
            System.out.println("truck isn't null");
    }
}
