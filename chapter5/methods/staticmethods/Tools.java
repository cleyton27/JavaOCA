package com.ocaj.exam.tutorial.chapter5.methods.staticmethods;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tools {


    /*
     The static keyword can be used to indicate that a method is a static
      , or class, method instead of a standard method.The static methods a
       belongs to the class and not to an object or the  instance of the class*/

    public static String formatDate(){
        Date date = new Date();
        Format formatter = new SimpleDateFormat("MMM-dd-yy");
        return formatter.format(date);
    }

    public static void main(String[] args) {
        System.out.println(Tools.formatDate());

    }

}
