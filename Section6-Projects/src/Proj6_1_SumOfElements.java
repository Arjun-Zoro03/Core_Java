import java.util.ArrayList;
import java.util.Random;

public class Proj6_1_SumOfElements {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(22);
        numberList.add(55);
        numberList.add(121);
        System.out.println(sumElements(numberList));
    }

    public static int sumElements(ArrayList<Integer> numberList) {
        int sum = 0;
        for(int i = 0;i < numberList.size();i++)
            sum += numberList.get(i);
        return  sum;
    }
}
