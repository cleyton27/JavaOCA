package com.ocaj.exam.tutorial.chapter5.methods;

public class AccessModifier {
    /*
    The java language allows for methods to be given access modifiers that indicate
    to the compiler and Java virtual machine what other objects can access this code.
    They are, in order of most restrictives, private, default(package-private), protect and public
     */

    private int getScore(){

        return 0;
    }

    /*
     No access modifier is declared so this will use default (package-private)
    */
    int getScore1(){
    return 0;
    }

    protected int getScore2(){
    return 0;
    }

    public int getScore3(){
        return 0;
    }

}
