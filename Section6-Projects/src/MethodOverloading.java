public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(getResult(5));
        System.out.println(getResult(5,4));
        System.out.println(getResult(5,"12"));
        System.out.println(getResult("John","Baugh"));

    }

    public static int getResult(int a){
        return a*2;
    }

    public static int getResult(int a,int b){
        return a*b;
    }

    public static int getResult(int a,String b){
        return a*Integer.parseInt(b);
    }

    public static String getResult(String a,String b){
        return a + " " + b;
    }

}
