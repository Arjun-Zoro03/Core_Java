import java.sql.SQLOutput;
import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        String city;
        int age;
        double inputNumber;

        System.out.println("What is your name?");
        name = keyboard.nextLine();

        System.out.println("What is your age?");
        age = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("enter real number: ");
        inputNumber = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println("Which city do you live in?");
        city = keyboard.nextLine();

        System.out.println("Hello " + name);
        System.out.println("age is " + age);
        System.out.println("city is " + city);
        System.out.println("Result is: " + inputNumber*2);
    }
}