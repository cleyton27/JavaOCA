package com.ocaj.exam.tutorial.chapter3.operators.strings;

public class ToStringMethod {
    private String owner = "Blackbeard";
    private String location = "Outer banks";

    @Override
    public String toString() {
        return "Map Owner: " + owner + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ToStringMethod ts = new ToStringMethod();
        System.out.println(ts);
    }
}
