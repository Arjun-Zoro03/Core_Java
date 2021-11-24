import java.util.ArrayList;
import java.util.Scanner;

public class Prog4_2_ArrayLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numberList = new ArrayList<>();
        double input;

        System.out.println("Enter postive real number to add to the list");
        System.out.println("Enter negative number to exit");
        input = sc.nextDouble();

        while(input>0){
            numberList.add(input);
            System.out.println("Enter postive real number to add to the list");
            System.out.println("Enter negative number to exit");
            input = sc.nextDouble();
        }

        for(int i = numberList.size() - 1;i >= 0; i --)
            System.out.println(numberList.get(i));
    }
}
