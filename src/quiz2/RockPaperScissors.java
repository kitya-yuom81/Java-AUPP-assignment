package quiz2;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter 0 for Rock, 1 for Paper, 2 for Scissors: ");
        int userChoice = scanner.nextInt();

        int computerChoice = random.nextInt(3);

        String[] options = {"Rock", "Paper", "Scissors"};

        System.out.println("You chose: " + options[userChoice]);
        System.out.println("Computer chose: " + options[computerChoice]);

        if (userChoice == computerChoice) {
            System.out.println("It's a draw!");
        } else if ((userChoice == 0 && computerChoice == 2) ||
                (userChoice == 1 && computerChoice == 0) ||
                (userChoice == 2 && computerChoice == 1)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        scanner.close();
    }
}
