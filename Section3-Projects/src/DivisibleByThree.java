import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter your integer:");
        number = sc.nextInt();
        if (number % 3 == 0)
            System.out.println("The given number is divisible by 3.");
        else
            System.out.println("The given number is not divisible by 3.");
    }
}
