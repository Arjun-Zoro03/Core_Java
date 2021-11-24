import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwiceData {
    public static void main(String[] args) {
        Scanner readNums;
        PrintWriter writeTwiceNums;

        try{
            readNums = new Scanner(new File("nums.txt"));
            writeTwiceNums = new PrintWriter("twice_nums.txt");


            while (readNums.hasNext())
                writeTwiceNums.println(2*readNums.nextInt());

            readNums.close();
            writeTwiceNums.close();
        }

        catch (FileNotFoundException ex){
            System.out.println("File not found!");
        }

    }
}
