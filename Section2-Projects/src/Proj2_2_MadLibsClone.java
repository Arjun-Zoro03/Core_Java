import java.util.Scanner;

public class Proj2_2_MadLibsClone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String adjective1;
        String girlsName;
        String adjective2;
        String occupation;
        String placeName;
        String clothing;
        String hobby;
        String adjective3;
        String occupation2;
        String boysName;
        String mansName;

        System.out.println("Enter an adjective: ");
        adjective1 = sc.nextLine();

        System.out.println("Enter the  girl's name: ");
        girlsName = sc.nextLine();

        System.out.println("Enter an adjective: ");
        adjective2 = sc.nextLine();

        System.out.println("Enter an occupation: ");
        occupation = sc.nextLine();

        System.out.println("Enter the name of a place: ");
        placeName = sc.nextLine();

        System.out.println("Enter the name of a piece of clothing: ");
        clothing = sc.nextLine();

        System.out.println("Enter the name of a hobby: ");
        hobby = sc.nextLine();

        System.out.println("Enter an adjective: ");
        adjective3 = sc.nextLine();

        System.out.println("Enter an occupation: ");
        occupation2 = sc.nextLine();

        System.out.println("Enter the boy's name: ");
        boysName = sc.nextLine();

        System.out.println("Enter the man's name: ");
        mansName = sc.nextLine();

        System.out.println("There once was a " + adjective1 + " girl named " + girlsName + " who was a " + adjective2
                + " " + occupation + " in the kingdom of " + placeName + ".");
        System.out.println("She loved to wear " + clothing + " and to " + hobby + "." + " She wanted to marry the " +
                adjective3 + " " + occupation2 + " named " + boysName + " but her father, king " + mansName +
                " forbid her from seeing him.");
    }
}
