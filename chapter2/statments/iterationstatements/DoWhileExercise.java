package com.ocaj.exam.tutorial.chapter2.statments.iterationstatements;

public class DoWhileExercise {

    public void checkIfThereArePiecesOfBait(){
        String fishingSession = "active";

        int piecesOfBait =5;
        piecesOfBait =0;

        do {

            if (piecesOfBait ==0){
                System.out.println("have not baits");
                break;

            }else if (fishingSession.equals("active")){
                System.out.println(fishingSession +" "+piecesOfBait );
                piecesOfBait--;
            }
        }while (piecesOfBait !=0);

    }


    public static void main(String[] args) {
        DoWhileExercise dw = new DoWhileExercise();
        dw.checkIfThereArePiecesOfBait();
    }
}
