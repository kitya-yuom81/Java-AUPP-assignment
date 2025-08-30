package test;

import java.util.Scanner;

public class FindYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        long minutes = input.nextLong();

        long minutesInYear = 60 * 24 * 365;
        long years = minutes / minutesInYear;
        long remainingDays = (minutes % minutesInYear) / (60 * 24);

        System.out.println(minutes + " minutes is approximately "
                + years + " years and "
                + remainingDays + " days");
    }
}
