package com.ocaj.exam.tutorial.chapter2.statments.transfercontrol;

public class ContinueStatement {

    /*This method prints the days that's allowed to fish. When isn't allowed
    to fish the method just skip fishing's days and prints only the camping

     */
    public void activetiesByDay(){
    int totalDaysCamping =0;
    int daysAllowedFish = 5;

    for (int i= 1; i<8; i++){
        totalDaysCamping++;
        System.out.print("\nDay "+i +" :camping");

        /*
        Just print the fishing days that aren't between 1 and 5

        if (totalDaysCamping >=1 && 5>= totalDaysCamping){
            continue;
        }*/

        if (totalDaysCamping>daysAllowedFish){
            continue;
        }

        System.out.print("and fishing");
    }

    }

    public static void main(String[] args) {
        ContinueStatement cs = new ContinueStatement();
        cs.activetiesByDay();
    }
}
