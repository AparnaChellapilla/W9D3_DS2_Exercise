package com.tts;

//Question 3 : Write a public static method called "toPower" that takes in as parameters two integers called size and power.
// The method should return an array of size "size" with each array index raised to the value of "power.
// " So, for example, if we passed in "size = 4" and "power = 2" to the "toPower," the method should return the following result: [0,1,4,9]

import java.util.Arrays;

import static java.lang.Double.valueOf;

public class Q3pow {

    public void power(){
        int size = 5 ;
        int power = 4;
        double[] result = toPower(size, power);
        System.out.println("Your result is : " + Arrays.toString(result));
    }
    private static double[] toPower(int size, int power){
        double[] result = new double[size];
        for(int i=1;i < size;i++) {
            result[i] = Math.pow(valueOf(i),valueOf(power));
        }
        return result;

    }
}
