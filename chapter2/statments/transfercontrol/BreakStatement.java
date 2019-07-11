package com.ocaj.exam.tutorial.chapter2.statments.transfercontrol;

public class BreakStatement {

    public void fishingByHour(){
        int totaltHoursFishing = 0;
        int hoursAllowedFishing =4;

        for (int i =0; i<25; i++){
            totaltHoursFishing = ++totaltHoursFishing;
            if (totaltHoursFishing>hoursAllowedFishing){
                break;
            }

            System.out.println("Total of hours allowed "+ totaltHoursFishing);
        }

    }

    public static void main(String[] args) {
        BreakStatement bs = new BreakStatement();
        bs.fishingByHour();
    }

}
