package com.ocaj.exam.tutorial.chapter3.stringbuilderclassandmethods;

public class DeleteMethod {

    public static void main(String[] args) {
        StringBuilder mateyMessage;
        // This method is auto explained if receive 2 as parameter star and end and removes
        // characters between start and end.
        mateyMessage = new StringBuilder("Shiver Me Timbers!");
        System.out.println(mateyMessage.delete(6,16));
    }
}
