package com.ocaj.exam.tutorial.chapter2.statments.iterationstatements;

public class WhileStatement {

    public static void main(String[] args) {
        String fishingSession = "active";
        int fishLimit = 0;
        while (fishLimit<=10){
            fishLimit++;
            System.out.println(fishingSession);
            if (fishLimit ==5){
                System.out.println("Inactive");
                break;
            }

        }
    }
}
