package quiz2;

import java.util.Random;

public class RandomMonth {
    public static void main(String[] args) {
        Random random = new Random();
        int monthNumber = random.nextInt(12) + 1; // 1–12

        String monthName = switch (monthNumber) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Unknown";
        };

        System.out.println("Random month number: " + monthNumber);
        System.out.println("Month name: " + monthName);
    }
}

