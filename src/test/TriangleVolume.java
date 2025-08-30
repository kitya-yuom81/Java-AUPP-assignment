package test;

import java.util.Scanner;

public class TriangleVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base of triangle: ");
        double base = input.nextDouble();

        System.out.print("Enter height of triangle: ");
        double height = input.nextDouble();

        System.out.print("Enter length of prism: ");
        double length = input.nextDouble();

        double volume = 0.5 * base * height * length;

        System.out.println("The volume of the triangle prism is: " + volume);
    }
}
