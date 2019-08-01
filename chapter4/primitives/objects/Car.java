package com.ocaj.exam.tutorial.chapter4.primitives.objects;

public class Car {
    int topSpeed;
    boolean running;

    public Car(int topSpeed, boolean running) {
        this.topSpeed = topSpeed;
        this.running = running;
    }

    public boolean isRuning(){
        return running;
    }

    /*
    An object is declared in the same manner as primitive
    but it cannot be used until it has been initialized
     */

    public static void main(String[] args) {
        /*
        new operator tells to JVM to use the blueprint to create a new
        instance class, the result o which is an object
         */
        Car bigCar =new Car(125, true);
        boolean running = bigCar.isRuning();

        Car oldCar;
        /*
        This is an illegal example. You cannot use a method on an
        uninitialized object
         */
        //boolean runningOldCar = oldCar.isRuning();


    }
}
