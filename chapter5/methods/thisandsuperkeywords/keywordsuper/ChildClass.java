package com.ocaj.exam.tutorial.chapter5.methods.thisandsuperkeywords.keywordsuper;


    public class ChildClass extends ParentClass {

        public ChildClass() {
            System.out.println("ChildClass constructor "+super.word);
        }

        public ChildClass(String s) {
            super(s);
            System.out.println("ChildClass constructor "+s);
        }

        @Override
        public String className() {
            return "ChildClass -> "+super.className();
        }

        public static void main(String[] args) {
            ChildClass cc1 = new ChildClass("test");
            ChildClass cc2 = new ChildClass();
            System.out.println(cc1.className());

        }

    }

