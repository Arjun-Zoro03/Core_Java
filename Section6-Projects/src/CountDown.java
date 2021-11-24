public class CountDown {
    public static void main(String[] args) {
        countDownFrom(10);
        countUp(0,10);
    }

    public static void countDownFrom(int num) {
        if (num >= 0 ){
            System.out.println(num);
            countDownFrom(num-1);
        }
    }

    public static void countUp(int start, int end) {
        if (start <= end){
            System.out.println(start);
            countUp(start+1,end);
        }
    }
}
