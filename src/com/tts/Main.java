//Question 1
package com.tts;

import java.lang.Math;
import java.util.*;
import static java.lang.Double.valueOf;

public class Main {

    public static void main(String[] args) {

        Scanner select = new Scanner(System.in);
        System.out.println("Enter your choice: \n 1.Sum of numbers \n 2.Max in an array \n 3.Getting the power to a number");

        int op = select.nextInt();

        switch(op) {
            case 1:
                Q1sum select1 = new Q1sum();
                select1.sum();
                break;

            case 2:
                Q2max select2 = new Q2max();
                select2.max();
                break;

            case 3:
                Q3pow select3 = new Q3pow();
                select3.power();
                break;

            default:
                System.out.println("Invalid input, please select from either 1,2 or 3)");
                select.close();

        }








    }


}




