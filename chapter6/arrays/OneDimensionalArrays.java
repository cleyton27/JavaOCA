package com.ocaj.exam.tutorial.chapter6.arrays;

import com.ocaj.exam.tutorial.chapter4.primitives.objects.Car;

import java.time.Clock;

public class OneDimensionalArrays {

    /*
    A java array is an object that act as a container by storing a fixed number of
    the same type values.
    The values are accessed by using an index.
     */

    //A one-dimensional array uses only a single index



    public static void intContainer(){
        int[] arrayOfInts = new int[3];
        arrayOfInts[0] = 5;
        arrayOfInts[1] = 10;
        arrayOfInts[2] = 15;
        System.out.println("All positions of the array "+arrayOfInts[0] +" "+arrayOfInts[1] +" "+arrayOfInts[2] +" ");

    }

    // Two ways of how to initialize an array with the new operator

    String[] clockTypes = new String[3];
    String clockTypes2[] = new String[3];

    //Even arrays of primitives use the new operator
    int[] alarm = new int[3];

    // It is also possible  to initialize arrays assign values directly after to declare it
    // When is assigned a value in the arrays the amount of items will be the size of it
    int [] numebers ={123, 568 };
    String[] names = {"Petter", "Uncle Been", "Aunt May"};
    Car [] cars = {new Car(300,true), new Car(400,false)};



    /*
    The arrycopy() method copy the data and create two independent arrays upon completions
     */

    public void testArraycopy(){
    String [] clockTypes = {"Wirst Watch","Desk Watch", "Wall Watch"};
    String[] newClockTypes = new String[2];
    System.arraycopy(clockTypes, 0, newClockTypes, 0,2);

    for (String s : clockTypes){
        System.out.println(s);
    }
        System.out.println("------------");
        for (String s : newClockTypes){
            System.out.println(s);
        }

    }

        public void beteraba(){
            System.out.println("Beterraba");
        }

    public static void main(String[] args) {
        //OneDimensionalArrays.intContainer();
        OneDimensionalArrays oneDimensionalArrays = new OneDimensionalArrays();

     /*
        for (String names: oneDimensionalArrays.names) {
            System.out.println(names);
        }

        for (Car car : oneDimensionalArrays.cars){
            car.isItRunning();
        }

      */

     oneDimensionalArrays.testArraycopy();
    }
}
