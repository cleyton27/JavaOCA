package com.ocaj.exam.tutorial.chapter3.stringbuilderclassandmethods;

public class DeleteChartAtMethod {
    public static void main(String[] args) {
        StringBuilder mateyMessage;
        mateyMessage =new StringBuilder("Shiver Me Timbers!");
        // Removes the '!' and prints out "Shiver Me Timbers"
        System.out.println(mateyMessage.deleteCharAt(17));
    }
}
