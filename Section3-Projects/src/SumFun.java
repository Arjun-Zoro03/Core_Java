import java.util.Scanner;

public class SumFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int input;

        System.out.println("Enter a non-negative integer to add");
        System.out.println("Or negative integer to exit!");
        input = sc.nextInt();

        while (input >= 0){
            sum += input;
            System.out.println("Enter a non-negative integer to add");
            System.out.println("Or negative integer to exit!");
            input = sc.nextInt();
        }

        System.out.println("Final sum is: " + sum);
    }
}
