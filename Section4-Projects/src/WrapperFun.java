import java.util.ArrayList;

public class WrapperFun {
    public static void main(String[] args) {
        ArrayList<Integer> myAL = new ArrayList<>();

        myAL.add(10);
        myAL.add(20);

        for(int num: myAL)
            System.out.println(num);

        String someValue = "450";
        int numericValue = Integer.parseInt(someValue);
        numericValue += 10;

        System.out.println(numericValue);

        String anotherValue = "3.14159";
        double doubleValue = Double.parseDouble(anotherValue);
        doubleValue += 2.5;

        System.out.println(doubleValue);

    }
}
