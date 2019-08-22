package com.ocaj.exam.tutorial.chapter5.localvariables;

public class LocalVariables {

    void simpleMethod(){

        //Starts of code A
        int totatlCount =0;
        System.out.println("Starting in A block: "+totatlCount);
        //Starts of code B

        for (int i = 0; i <3; i++) {
            int forCount = 0;
            totatlCount++;
            forCount++;
            System.out.println("Inside B block: "+totatlCount);
            { //Starts of code C
                int block1Count = 0;
                totatlCount++;
                forCount++;
                block1Count++;
                System.out.println("Inside C block: "+totatlCount);
            }// Ends of bloc C

            {// Stars block D
                int block2Count = 0;
                totatlCount++;
                forCount++;
                block2Count++;
                System.out.println("Inside D block: "+totatlCount);
            }//Ends of block D

            /*
            These two variables have no relation to above ones of the same name
             */
            int block1Count;
            int block2Count;

        } // Ends  of code block B

        System.out.println("Final value of totalCount variable: "+totatlCount);
    } // Ends of code clock A


    public static void main(String[] args) {

        LocalVariables lv = new LocalVariables();
        lv.simpleMethod();
    }
}
