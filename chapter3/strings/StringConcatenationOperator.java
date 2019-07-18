package com.ocaj.exam.tutorial.chapter3.strings;

public class StringConcatenationOperator {
    public static void main(String[] args) {
        String item = "boubloon";
        String question = "Whati is a "+ item+"?";
        System.out.println("Question: "+question);

        //Concatenation with primitives
        float reale = .007812f;
        float escudo = .125f;
        // value added
        System.out.println(reale+ escudo+ " %percent of one gold doubloon");
        // includes parentheses
        System.out.println((reale+ escudo)+ " %percent of one gold doubloon");
        // includes parentheses
        System.out.println(" % percent of one gold doubloon "+(reale+ escudo) );
        // values not added
        System.out.println(" % percent of one gold doubloon "+reale+ escudo);
    }
}
