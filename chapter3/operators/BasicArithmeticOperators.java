package com.ocaj.exam.tutorial.chapter3.operators;

public class BasicArithmeticOperators {

    public static void main(String[] args) {
        /*Addition operator example

         */

        int apples = 50;
        int grennApples = 50;
        int totalApples = apples + grennApples;
        System.out.println("total of Apples: "+ totalApples);

        // Substraction operator example
        int spoliedApples = 10;
        int totalGoogApples= totalApples- spoliedApples;
        System.out.println("total of Apples: "+totalApples);

        //Multiplication operator example
        int applebox = 20;
        int totalApplesInGeneral = totalApples * applebox;
        System.out.println("total of Apples: "+totalApples);

        // Division operator exemple
        int fruitStores = 4;
        int totalApplesInEachFruitStores = totalApplesInGeneral/ fruitStores;
        System.out.println("total of apples per store: "+totalApplesInEachFruitStores);

        // Modulus operator examplo

        int applesRemainder = totalApples % fruitStores;
        System.out.println("apples remainder "+ applesRemainder);
    }
}
