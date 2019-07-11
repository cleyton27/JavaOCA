package com.ocaj.exam.tutorial.chapter2.statments.transfercontrol;

public class ReturnStatiment {

    // This method receive 3 values as argument and return the variable the receive total of fish
    public int getTotalFishTypes(int saltWaterFishTotal, int freshWaterFishTotal, int brackisFishTotal){
        int fishTypesTotal = saltWaterFishTotal + freshWaterFishTotal + brackisFishTotal;
        return fishTypesTotal;
    }

    public static void main(String[] args) {
        ReturnStatiment rs = new ReturnStatiment();

        /*The method receive 3 values of parameters and returns a value that is stored in the
        totalOfFish
        */
        int totalOfFish= rs.getTotalFishTypes(2,5,6);

        System.out.println(totalOfFish);

    }
}
