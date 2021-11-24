public class ArrayFun {
    public static void main(String[] args) {
        int[] myArray = new int[5];
        myArray[0] = 10;
        myArray[1] = 20;
        myArray[2] = 30;
        myArray[3] = 40;
        myArray[4] = 50;
//        for(int i = 0; i < myArray.length; i++)
//            System.out.println(myArray[i]);

        for(int num: myArray)
            System.out.println(num);
    }
}
