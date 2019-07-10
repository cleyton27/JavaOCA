package com.ocaj.exam.tutorial.chapter2.statments;

public class ClassTest {
    public static void main(String[] args) {

        IfElse ifElse = new IfElse();

        ifElse.trueOrFalse();

        WrapperBoolean wrapperBoolean = new WrapperBoolean();

        wrapperBoolean.checkIt();


        TernaryOperator to = new TernaryOperator();
        to.tenaryOperator();
        to.ifElseOperators();

        System.out.println();
        SwitchCase sc =  new SwitchCase();
        sc.tiypeOfBait();
        System.out.println();
        String fish = sc.generateRandomFish();
        System.out.println(fish);

    }

}
