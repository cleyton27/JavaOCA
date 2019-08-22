package com.ocaj.exam.tutorial.chapter5.constructors;

public class LoanDetails {

    private int term;
    private double rate;
    private double principal;

    /*

Another way to declare a constructor

    public LoanDetails() {
        this(180,0.25,0);
    }


     */

    public LoanDetails() {
        term =180;
        rate = .0265;
        principal= 0;
    }

    /*
    Overloading constructor
     */
    public LoanDetails(int term, double rate, double principal) {
        this.term = term;
        this.rate = rate;
        this.principal = principal;
    }

    public void setLoanDetails(double p) {
        principal = p;
    }

    public double monthlyPayment(){
        return (rate * principal / 12)/ (1.0 -Math.pow(((rate/12)+1.0), (-term)));
    }

    public static void main(String[] args) {
        LoanDetails ld = new LoanDetails();
        LoanDetails ld2 = new LoanDetails(10, .025,125000);
        ld.setLoanDetails(15000);

        System.out.println("Payment 1 : "+ld.monthlyPayment());
        System.out.println("Payment 2 : "+ld2.monthlyPayment());




    }

}
