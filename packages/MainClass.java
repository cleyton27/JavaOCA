
//Package Statement
package com.ocaj.exam.tutorial.chapter1.packages;

/* Imports class ArrayLis from  the java.util package */
import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" \nEnter your favoriteplanet: ");
        String planet =  sc.next();

        /*Creat list for planets*/

        ArrayList planetList = new ArrayList();
        /* Adds users input to the list*/
        planetList.add(planet);
        //Adds a string to the list
        planetList.add("Gliese 581 c");

        System.out.println("\nTwo cool planets: "+ planetList);

    }

}
