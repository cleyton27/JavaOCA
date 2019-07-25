package com.ocaj.exam.tutorial.chapter3.stringbuilderclassandmethods;

public class ConstructorsofStringBuilder {

    StringBuilder sb1 = new StringBuilder();
    CharSequence seq;
    StringBuilder sb2 = new StringBuilder(seq);
    StringBuilder sb3 = new StringBuilder(3);
    StringBuilder sb4 = new StringBuilder("StringBuilder constructor");

    public static void main(String[] args) {
        StringBuilder sb3 = new StringBuilder(12);
        sb3.append('s');
        sb3.append('r');
        System.out.println(sb3.length());

    }


}
