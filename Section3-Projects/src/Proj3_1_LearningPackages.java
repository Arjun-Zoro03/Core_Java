import java.util.Scanner;

public class Proj3_1_LearningPackages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int packageNumber;
        int totalCourses;
        int totalCost;
        System.out.println("Enter the package number: ");
        packageNumber = sc.nextInt();

        System.out.println("Enter the total number of courses: ");
        totalCourses = sc.nextInt();

        if (packageNumber == 1){
            totalCost = 10;
            if (totalCourses > 2)
                totalCost += 6*(totalCourses - 2);
            }
        else if(packageNumber == 2){
            totalCost = 12;
            if (totalCourses > 4)
                totalCost += 4*(totalCourses - 4);
        }
        else{
            totalCost = 15;
            if (totalCourses > 6)
                totalCost += 3*(totalCourses - 6);
        }
    System.out.println(totalCost);
    }
}
