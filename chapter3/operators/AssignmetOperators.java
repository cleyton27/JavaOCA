package com.ocaj.exam.tutorial.chapter3.operators;

public class AssignmetOperators {

    public static void main(String[] args) {

        byte a =10;
        System.out.println("initial a valuer: "+a);
        a =10;
        a +=3;
        System.out.println("a += 3: "+a);
        a =15;
        a -=3;
        System.out.println("a -= 3: "+a);
        a =20;
        a *=3;
        System.out.println("a *= 3: "+a);
        a =25;
        a /=3;
        System.out.println("a /= 3: "+a);
        a =35;
        a %=3;
        System.out.println("a %= 3: "+a);
        a =40;
        a ^=3;
        System.out.println("a ^= 3: "+a);
        a =45;
        a |=3;
        System.out.println("a |= 3: "+a);
        a =50;
        a <<=3;
        System.out.println("a <<= 3: "+a);
        a =55;
        a >>=3;
        System.out.println("a >>= 3: "+a);
        a =60;
        a >>>=3;
        System.out.println("a >>>= 3: "+a);


    }


}
