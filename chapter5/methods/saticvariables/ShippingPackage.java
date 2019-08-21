package com.ocaj.exam.tutorial.chapter5.methods.saticvariables;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

public class ShippingPackage {

    /*
    The static keyword can also be used to create class and variables.A class variable is
    similar to an instance variable, but instead of belonging to the instance of the object,
    it belongs to the class
     */

    public static int nextTrackingNumber = 100000;
    private int packageTrackingNumber;

    public ShippingPackage() {
        this.packageTrackingNumber = nextTrackingNumber;
        nextTrackingNumber++;
    }

    public int getPackageTrackingNumber() {
        return packageTrackingNumber;
    }

    public static void main(String[] args) {
        ShippingPackage sp1 = new ShippingPackage();
        ShippingPackage sp2 = new ShippingPackage();
        ShippingPackage sp3 = new ShippingPackage();

        //An example of how to access a static variable directly, is not required to instance a new object
        System.out.println(ShippingPackage.nextTrackingNumber);
        System.out.println("Package One Tracking number: "+sp1.getPackageTrackingNumber());
        System.out.println("Package Two Tracking number: "+sp2.getPackageTrackingNumber());
        System.out.println("Package Three Tracking number: "+sp3.getPackageTrackingNumber());
    }
}
