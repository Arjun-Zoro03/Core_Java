
import java.util.Scanner;

public class Proj4_1_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] intArray = new int[5];

        for(int i = 0; i < 5; i++) {
            System.out.println("Enter an integer");
            intArray[i] = sc.nextInt();
        }
        for(int num: intArray)
            System.out.println(num*2);
    }
}
