package com.ocaj.exam.tutorial.chapter1.imports;

/*Import static member ITALY */

import static java.util.Locale.ITALY; // Implicit import

/*Import all static member in class Locale */
import static java.util.Locale.*; // Explicit import

public class ClassTest {

    public static void main(String[] args) {
        System.out.println("Locale: "+ ITALY);
        System.out.println("Locale: "+ JAPAN);
        System.out.println("Locale: "+ UK);
    }


}
