import java.util.Scanner;

public class RepitionFun {
    public static void main(String[] args) {
//        int count = 0;
//
//        while(count < 10){
//            System.out.println(count);
//            count++;
//        }
//
//        int count2 = 0;
//
//        do{
//            System.out.println(count2);
//            count2++;
//        }while(count2 < 10);
//
//        for(int i = 0;i < 10; i++){
//            System.out.println(i);
//        }

        Scanner sc = new Scanner(System.in);
        int input;

        System.out.println("Enter a non-negative integer: ");
        System.out.println("Or negative integer to exit!");
        input = sc.nextInt();

        while(input >= 0){
            System.out.println(input);
            System.out.println("Enter a non-negative integer: ");
            System.out.println("Or negative integer to exit!");
            input = sc.nextInt();
        }

    }
}
