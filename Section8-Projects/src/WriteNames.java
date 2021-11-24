import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteNames {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Arjun");
        names.add("Virat");
        names.add("John");
        names.add("Saichetan");
        names.add("Lokesh");

        try {
            PrintWriter pw = new PrintWriter("names.txt");

            for(String name:names)
                pw.println(name);

            pw.close();
        }

        catch (FileNotFoundException ex){
            System.out.println("File not found!");
        }
    }
}
