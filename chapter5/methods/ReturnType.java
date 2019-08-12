package com.ocaj.exam.tutorial.chapter5.methods;

import com.ocaj.exam.tutorial.chapter4.primitives.arrays.Array;

import java.util.ArrayList;

public class ReturnType {
    /*
    Methods can return data to the code that has called them. A method can return
    either one variable or none at all.
     */

    //The return is declared after the access modifier
    public boolean isActive(){
        return true;
    }
    public int getCurrentTotal(){
        return 5;
    }

    //the void  does not return nothing
    public void processPedingData(){

    }

    public ArrayList getAllAccounts(){
        return new ArrayList();
    }
}
