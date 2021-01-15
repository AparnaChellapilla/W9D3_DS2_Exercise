package com.tts;

public class Q2max {

    public void max() {

        double[] exampleArray = {1, 5, 6, 5, 4, 1};

        double maximum = exampleArray[0];

        int index = 0;
        int i;

        for (i = 1; i < exampleArray.length; i++) {

            if (exampleArray[i] > maximum) {

                maximum = exampleArray[i];
                index = i;

            }
        }
        System.out.println(index);
        System.out.println(exampleArray[index]);

    }
}

