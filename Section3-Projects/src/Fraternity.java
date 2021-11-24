import java.util.Scanner;

public class Fraternity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        char gender;

        System.out.println("Enter age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter gender: ");
        gender = sc.next().charAt(0);

        if (age >= 19 && gender == 'M'){
            System.out.println("You can join the Fraternity.");
        }
        else{
            System.out.println("Sorry, you cannot join the Fraternity.");
        }
    }
}
