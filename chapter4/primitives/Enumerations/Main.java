package com.ocaj.exam.tutorial.chapter4.primitives.Enumerations;

import java.util.Scanner;

public class Main {

    /*
    A example how to use Enumerations
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Suit cardSuit;
        System.out.println("Choose a card suit");
        System.out.println("1 - Hearts, 2 - Clubs, 3- Diamonds, 4 - Spades : ");

        byte option = sc.nextByte();

        if (option <0 || option>4){
            System.out.println("This options doesn't exists! please choose a valid position");
        }

        switch (option) {

            case 1:
                cardSuit = Suit.HEARTS;
                System.out.println("Your card is "+cardSuit);
                break;
            case 2:
                cardSuit = Suit.CLUBS;
                System.out.println("Your card is "+cardSuit);
                break;
            case 3:
                cardSuit = Suit.DIAMONDS;
                System.out.println("Your card is "+cardSuit);

                break;
            case 4:
                cardSuit = Suit.SPADES;
                System.out.println("Your card is "+cardSuit);

                break;
        }


    }
}
