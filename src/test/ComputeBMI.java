package test;

import java.util.Scanner;

public class ComputeBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in meters: ");
        double height = input.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("Your BMI is: " + bmi);

        if (bmi < 18.5)
            System.out.println("Status: Underweight");
        else if (bmi < 25)
            System.out.println("Status: Normal");
        else if (bmi < 30)
            System.out.println("Status: Overweight");
        else
            System.out.println("Status: Obese");
    }
}
