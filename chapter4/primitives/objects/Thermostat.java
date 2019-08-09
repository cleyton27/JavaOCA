package com.ocaj.exam.tutorial.chapter4.primitives.objects;

// Basic class that has only two methods and an instance variable
public class Thermostat {
    int temperatureTrigger;
    int getTemperatureTrigger(){
        return temperatureTrigger;
    }
    public void setTemperatureTrigger(int temperatureTrigger){
        this.temperatureTrigger = temperatureTrigger;
    }

    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();
        thermostat.setTemperatureTrigger(20);
        System.out.println(thermostat.getTemperatureTrigger());
    }
}
