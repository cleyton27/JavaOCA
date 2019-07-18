package com.ocaj.exam.tutorial.chapter3;

public class NegationOperatorWithRelationalAndLogicalOperators {
    public static void main(String[] args) {
        // Example with relation expression
        int iVar1 = 0;
        int iVar2 = 1;
        if (!(iVar1 <= iVar2))
            System.out.println("True");
        else
            System.out.println("false");


        System.out.println();
        // Example with logical expression
        boolean bVar1 = false;
        boolean bVar2= true;
        if((bVar1 && bVar2) || (!(bVar1 && bVar2))){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
        System.out.println();

        // Example with equals method
        if (!"NAME".equals("NAME")){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        System.out.println();

        // Example with the String class's startWith method
        String s = "Captain Jack";
        System.out.println(!s.startsWith("Captain"));


    }


}
