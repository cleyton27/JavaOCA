package com.ocaj.exam.tutorial.chapter4.primitives.Enumerations;

public class EnumExample {

    //Another way to declare a enum inside a class
    enum TypeOfShoe{
        RUNNING, BASKETBALL, CROSS_TRAINING}

        TypeOfShoe shoe;

        public void createRunningShoes(){
        shoe = TypeOfShoe.RUNNING;
            System.out.println("your shoes is a "+ shoe +" shoe");
        }

    public static void main(String[] args) {
        EnumExample ex = new EnumExample();

        ex.createRunningShoes();

    }

    }

