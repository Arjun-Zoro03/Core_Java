import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numberToBeGuessed = random.nextInt(100) + 1;
        int numberGuessedByTheUser;
        int guessNumber = 1;

        System.out.println("Enter guess number 1 ");
        numberGuessedByTheUser = sc.nextInt();
        if (numberGuessedByTheUser == numberToBeGuessed)
            System.out.println("Congratulations, you guess the number in 1 guess! ");
        while (numberGuessedByTheUser != numberToBeGuessed){
            guessNumber += 1;
            if (numberGuessedByTheUser > 100 || numberGuessedByTheUser < 1)
                System.out.println("That was a wasted guess, pick a number between 1 and 100, both inclusive.");
            else if (numberGuessedByTheUser > numberToBeGuessed)
                System.out.println("Too High");
            else if(numberGuessedByTheUser < numberToBeGuessed)
                System.out.println("Too Low");
            System.out.println("Enter guess number " + guessNumber);
            numberGuessedByTheUser = sc.nextInt();
        }
        System.out.println("Congratulations, you guess the number in " + guessNumber + " guesses! ");
    }
}
