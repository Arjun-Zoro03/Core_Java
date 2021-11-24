import java.util.Scanner;

public class GradeFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char grade;

        System.out.println("Enter a grade: ");
        grade = sc.next().charAt(0);

        switch(grade) {
            case 'a':
            case 'A':
                System.out.println("Great job!");
                break;
            case 'B':
            case 'b':
                System.out.println("Good job.");
                break;
            case 'c':
            case 'C':
                System.out.println("You can do better.");
                break;
            case 'd':
            case 'D':
                System.out.println("You're getting pretty close to failing.");
                break;
            case 'f':
            case 'F':
                System.out.println("You are failing the course!");
                break;
            default:
                System.out.println("You have entered an invalid grade.");
        }
    }
}
