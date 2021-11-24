import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_3_Parallel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        for(int i = 0;i < 5; i++){
            System.out.println("Enter a name:");
            names.add(sc.nextLine());
            System.out.println("Enter the age:");
            ages.add(sc.nextInt());
            sc.nextLine();
        }

        for(int i = 0;i < 5; i++)
            System.out.println(names.get(i) + " is " + ages.get(i) + " years old.");

    }
}
