package com.ocaj.exam.tutorial.chapter2.statments.transfercontrol;

public class BreakStatement {
   /*This method will stop to run when the when the number of hours allowed to fish
   is reached
    */
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
