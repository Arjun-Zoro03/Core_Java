import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8_2_CircleFile {
    public static void main(String[] args) {
        ArrayList<Circle> circles = new ArrayList<>();

        fillCircles(circles);
        printCircles(circles);
    }

    public static void fillCircles(ArrayList<Circle> circles){
        Scanner infile;

        try{
            infile = new Scanner(new File("circle_data.txt"));
            Circle temp;
            double radius;

            while (infile.hasNext()){
                radius = infile.nextDouble();
                temp = new Circle(radius);
                circles.add(temp);
            }

            infile.close();
        }

        catch (FileNotFoundException ex){
            System.out.println("File not found!");
        }

    }

    public static void printCircles(ArrayList<Circle> circles){
        PrintWriter pw;

        try {
            pw = new PrintWriter("circles_output.txt");
            for(Circle circle: circles){
                System.out.println("Radius: " + circle.getRadius());
                System.out.println("Area: " + circle.area());
                System.out.println("Circumference: " + circle.circumference());
                System.out.println();

                pw.println("Radius: " + circle.getRadius());
                pw.println("Area: " + circle.area());
                pw.println("Circumference: " + circle.circumference());
                pw.println();
            }

            pw.close();
        }

        catch (FileNotFoundException ex){
            System.out.println("Error accessing file!");
        }

    }
}
