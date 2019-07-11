package com.ocaj.exam.tutorial.chapter2.statments.iterationstatements;

public class DoWhileStatement {

    public static void main(String[] args) {
        String fishingSession = "active";
        int piecesOfBait = 5;

        /*Statement do while iterates at least once the loop after the condition is checked with the statement while()
        in the final of the do while structure*/
        do {
            if (fishingSession.equals("active")){
                System.out.println(piecesOfBait);
                piecesOfBait --;
            }

        }while (piecesOfBait !=0);
    }
}
