public class MethodsDemo {
    public static void main(String[] args) {
        printHello();
        printNumber(10);
        int result = giveMe10();
        System.out.println(result);

        result = addThese(3,5);
        System.out.println(result);

        System.out.println(sqaure(5));
    }

    public static void printHello(){
        System.out.println("Hello there!");
    }

    public static void printNumber(int a){
        System.out.println("The number is: " + a);
    }

    public static int giveMe10(){
        return 10;
    }

    public static int addThese(int a,int b){
        return a+b;
    }

    public static double sqaure(double num){
        return num*num;
    }
}
