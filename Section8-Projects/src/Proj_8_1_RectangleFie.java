import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj_8_1_RectangleFie {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();

       fillRectangles(rectangles);
       printRectangles(rectangles);
    }

    public static void fillRectangles(ArrayList<Rectangle> rectangles){
        Scanner infile;

        try{
            infile = new Scanner(new File("rectangle_data.txt"));
            Rectangle temp;
            double length;
            double width;

            while (infile.hasNext()){
                length = infile.nextDouble();
                width = infile.nextDouble();
                temp = new Rectangle(length,width);
                rectangles.add(temp);
            }

            infile.close();
        }

        catch (FileNotFoundException ex){
            System.out.println("File not found!");
        }

    }

    public  static  void printRectangles(ArrayList<Rectangle> rectangles){
        for(Rectangle rectangle: rectangles) {
            System.out.println("Length: " + rectangle.getLength());
            System.out.println("Width: " + rectangle.getWidth());
            System.out.println("Perimeter: " + rectangle.perimeter());
            System.out.println("Area: " + rectangle.area());
            System.out.println();
        }
    }
}
