package com.ocaj.exam.tutorial.chapter2.statments.conditionalstatements;

import java.awt.*;
import java.util.Random;

public class SwitchCase {
    private enum ClamBait {
        FRESH, SALTED, ARTIFICIAL
    }

    // this method tells which bait the variable bait is
    public void tiypeOfBait(){
        ClamBait bait = ClamBait.ARTIFICIAL;

        switch (bait){
        //default statement prints No bait if the variable is void
        default:
            System.out.println("No bait");
            //break statement stop the program
            break;
            //Case the variable contents this value will be printed Fresh clams
            case FRESH:
                System.out.println("Fresh clams");

                //Case the variable contents this value will be printed Salted clams

            case SALTED:
                System.out.println("Salted clams");

                //Case the variable contents this value will be printed Artificial clams

            case ARTIFICIAL:
                System.out.println("Artificial clams");
        }
    }


    // this method will generate a random value and print the value generated contained in the case statement
    public String generateRandomFish(){
        String randomFish;
        Random randomObject = new Random();
        int randomNumber = randomObject.nextInt(4);

        switch (randomNumber){
            case 0:
                randomFish = "Blue Fish";
                break;

            case 1:
                randomFish ="Red Drum";

            case 2:
                randomFish = "Striped Bass";

            default:
                randomFish = "Unknow Fish Type";
                break;
        }
        return randomFish;
    }
}
