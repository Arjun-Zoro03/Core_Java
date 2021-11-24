import java.util.Random;

public class FunWith2DArrays {
    public static void main(String[] args) {
        int[][] my2DArray = new int[2][3];

        fill2DArray(my2DArray);
        print2DArray(my2DArray);

        twiceDArray(my2DArray);
        print2DArray(my2DArray);
    }

    public static void fill2DArray(int[][] twoDArr) {
        Random random = new Random();
        for(int i = 0;i < twoDArr.length; i++)
            for(int j = 0;j < twoDArr[i].length; j++)
                twoDArr[i][j] = random.nextInt(10);
    }

    public static void print2DArray(int[][] twoDArr) {
        for(int[] arr: twoDArr) {
            for (int number : arr) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    public static void twiceDArray(int[][] twoDArr) {
        Random random = new Random();
        for(int i = 0;i < twoDArr.length; i++)
            for(int j = 0;j < twoDArr[i].length; j++)
                twoDArr[i][j] *= 2;
    }


}
