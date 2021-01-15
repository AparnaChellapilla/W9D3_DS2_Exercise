package com.tts;
import java.util.*;

public class Q1sum {

    public void sum() {
        double[] exampleArray = {1,5,6,5,4,1};
        Scanner in = new Scanner(System.in);

        double sum = 0;

        System.out.println("Enter five numbers");
        for (int j=0;j< exampleArray.length;j++) {
            sum = sum + exampleArray[j];
        }
        System.out.println("Sum of the numbers:"+sum);
    }
}
