package com.ocaj.exam.tutorial.chapter5.passobjectbyreferenceandvalue;

public class PassingObjectsByReferenceToMethods {

    /*
        A reference is basically an internal index that represents the object.
        Objects passed by reference to a method. This means that instead of making a copy
        of the object and passing it, a reference to the original object is passed
        to the method.

     */


    int number;


    public PassingObjectsByReferenceToMethods() {

    }


    public PassingObjectsByReferenceToMethods(int number) {
        this.number = number;
    }

    public int getNumber(){
        return this.number;
    }

    void setNumber(int number){
        this.number = number;
    }

    void addThree (PassingObjectsByReferenceToMethods value){

        System.out.println("Parameter: value= "+ getNumber());
        setNumber(getNumber()+3);
        System.out.println("Leaving method: value "+getNumber());
    }

    public static void main(String[] args) {

        PassingObjectsByReferenceToMethods porm = new PassingObjectsByReferenceToMethods(1);

        // This time when the method returns to the calling code, the object has been modified.
        porm.addThree(porm);
        System.out.println("After method call: value "+porm.getNumber());

    }
}
