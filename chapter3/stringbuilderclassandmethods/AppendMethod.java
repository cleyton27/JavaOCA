package com.ocaj.exam.tutorial.chapter3.stringbuilderclassandmethods;

public class AppendMethod {

    public static void main(String[] args) {

        //The String Builder class's append method appends the supplied
        StringBuilder e = new StringBuilder("Examples:");
        e.append(" ").append("1");
        e.append(" ").append(new StringBuffer("2"));
        e.append(" ").append('\u0031');
        e.append(" ").append((int)2);
        e.append(" ").append(1L);
        e.append(" ").append(2F);
        e.append(" ").append(1D);
        e.append(" ").append(true);

        System.out.print(e);
    }
}
