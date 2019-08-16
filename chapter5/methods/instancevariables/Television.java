package com.ocaj.exam.tutorial.chapter5.methods.instancevariables;

public class Television {

    /*
    Instance variables are declared inside the class. They are called instance variables because they
    are created and remain in memory for as long as the instance of the class exists.
     */

    /*
    The instance variable are in the class scope not in a particular method scope
     */


    int channel  = 0;
    boolean on = false;

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getChannel() {

        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public static void main(String[] args) {

        Television tv1 = new Television();
        Television tv2 = new Television();

        tv1.setChannel(2);
        tv2.setChannel(7);

        System.out.println("Television channel for tv1: "+ tv1.getChannel());
        System.out.println("Television channel for tv2: "+ tv2.getChannel());


    }
}

