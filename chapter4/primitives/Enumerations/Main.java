package com.ocaj.exam.tutorial.chapter4.primitives.Enumerations;

import java.util.Scanner;

public class Main {
    Suit cardSuit;
   // boolean validOption = true;



    public byte chooseValidation(){
        Scanner sc = new Scanner(System.in);


        byte option = sc.nextByte();

        if (option >=0 || option >4){
            System.out.println("This options doesn't exists! please choose a valid position");

        }
        sc.close();
        return option;
    }

    public void choosingACardSuit() {
        System.out.println("Choose a card suit");
        System.out.println("1 - Hearts, 2 - Clubs, 3- Diamonds, 4 - Spades : ");
        byte option = chooseValidation();
        // tryAgain(validOption);



            switch (option) {

                case 1:
                    cardSuit = Suit.HEARTS;
                    System.out.println("Your card is " + cardSuit);
                    break;
                case 2:
                    cardSuit = Suit.CLUBS;
                    System.out.println("Your card is " + cardSuit);
                    break;
                case 3:
                    cardSuit = Suit.DIAMONDS;
                    System.out.println("Your card is " + cardSuit);

                    break;
                case 4:
                    cardSuit = Suit.SPADES;
                    System.out.println("Your card is " + cardSuit);

                    break;
            }


        }

    /*
    A example how to use Enumerations
     */
    public static void main(String[] args) {

        Main main = new Main();
        //main.choosingACardSuit();
    main.choosingACardSuit();

    }
}
