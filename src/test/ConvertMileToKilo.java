package test;

import java.util.Scanner;

public class ConvertMileToKilo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1 mile = 1.60934 km
        final double MILES_TO_KM = 1.60934;

        System.out.print("Enter distance in miles: ");
        double miles = input.nextDouble();

        double kilometers = miles * MILES_TO_KM;

        System.out.println(miles + " miles = " + kilometers + " kilometers");
    }
}
