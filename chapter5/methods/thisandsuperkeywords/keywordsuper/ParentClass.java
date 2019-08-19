package com.ocaj.exam.tutorial.chapter5.methods.thisandsuperkeywords.keywordsuper;

public class ParentClass {

    /*
    The super keyword is used to refer an object`s superclass. It can be used to access
    methods  that have been overridden in the current class or the constructor of superclass.
     */

    String word = "Parent variable";

    public ParentClass() {
        System.out.println("ParentClass constructor");
    }
    public ParentClass(String s) {
        System.out.println("ParentClass constructor "+s);
    }

    public String className(){
        return "ParentClass";
    }

}
