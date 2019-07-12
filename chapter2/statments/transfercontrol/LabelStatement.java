package com.ocaj.exam.tutorial.chapter2.statments.transfercontrol;

public class LabelStatement {

    public void labeledBreakTest() {
        myBreakLabel:
        while (true) {
            System.out.println("While loop 1");
            while (true) {
                System.out.println("While loop 2");
                while (true) {
                    System.out.println("While loop 3");
                    break myBreakLabel;
                }
            }
        }
    }

    public void labeledContinueTest() {
        int cont= 0;
        myContinueLabel:
        while (cont<10) {
            cont++;
           if (cont==3){
               System.out.println("skip");
               continue myContinueLabel;
           }
            System.out.println("While loop:  "+ cont );

        }
    }




    public static void main(String[] args) {
        LabelStatement ls = new LabelStatement();
        ls.labeledBreakTest();
        ls.labeledContinueTest();
    }
}