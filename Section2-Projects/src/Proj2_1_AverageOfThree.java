import java.util.Scanner;

public class Proj2_1_AverageOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, num3;
        System.out.println("Enter three numbers: ");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        num3 = sc.nextDouble();
        System.out.println("Average is: " + (num1 + num2 + num3)/3);
    }
}
