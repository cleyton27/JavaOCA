package com.ocaj.exam.tutorial.chapter2.statments.iterationstatements;

import java.util.ArrayList;
import java.util.List;

public class ForExercise {
    public static void main(String[] args) {

        List<Double> fishLengthList = new ArrayList<>();
        fishLengthList.add(10.0);
        fishLengthList.add(15.5);
        fishLengthList.add(18.0);
        fishLengthList.add(29.5);
        fishLengthList.add(45.5);

        for ( double fish: fishLengthList){
            if (fish > 28)
            System.out.println(fish);
        }


    }




}
