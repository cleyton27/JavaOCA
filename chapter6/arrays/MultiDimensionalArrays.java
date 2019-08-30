package com.ocaj.exam.tutorial.chapter6.arrays;

public class MultiDimensionalArrays {

    /*
    Multi-dimensional array have more than one index. A multi-dimensional
    array with two dimensions, or indexes is an array of arrays.
     */

    char [][] ticTacToeBoard = new char[3][3];

    public char assignmentingArrayElments(int y, int x){
        ticTacToeBoard[0][0] = 'X';
        ticTacToeBoard[1][1] = 'O';
        ticTacToeBoard[2][2] = 'X';
        return ticTacToeBoard[y][x];
    }

    public void runAnArrayOfTwoPositions(){
        for (int y=0; y<3; y++){
        for (int x =0; x<3; x++){
            ticTacToeBoard[x][y]='-';
            System.out.print(assignmentingArrayElments(x,y));

        }
            System.out.print("\n");
    }
}


// Initializing Multi-dimensional arrays
    String[][] squere = {{"1", "2"},{"3","4"} };
    String[][] squere2 = new String[2][2];
    int [][][] cube = new int[3][3][2];


    public void assgnningMultiDimensionalArray() {
        //Here only the size of the first element is declared.

        int[][] arrayDimension = new int[5][2];
        arrayDimension[0][0] = 1;
        arrayDimension[1][0] = 2;
        arrayDimension[2][0] = 3;
        arrayDimension[3][0] = 4;
        arrayDimension[4][0] = 5;
        arrayDimension[0][1] = 6;
        arrayDimension[1][1] = 7;
        arrayDimension[2][1] = 8;
        arrayDimension[3][1] = 9;
        arrayDimension[4][1] = 10;

        System.out.println(arrayDimension[0].length);


        //This statement is used to find out the row amount
        int row = arrayDimension[0].length;
        row--;
        System.out.println();

        /*
        This for with this statement is used when the row and the columns have
        different sizes
         */
        for (int y = 0; y < arrayDimension[0].length; y++) {
            for (int x = 0; x < arrayDimension.length; x++) {
                System.out.println(arrayDimension[x][y]);
            }

        }
    }
    public static void main(String[] args) {
        MultiDimensionalArrays ma = new MultiDimensionalArrays();
        ma.runAnArrayOfTwoPositions();
        System.out.println();
        ma.assgnningMultiDimensionalArray();

    }
    }