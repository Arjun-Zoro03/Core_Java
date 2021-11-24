import java.util.Random;

public class DiceSimulation {
    public static void main(String[] args) {
        Random random = new Random();
        int dieNumber;

        for(int i = 0; i < 10; i++){
            dieNumber = random.nextInt(6)+1;
            System.out.println(dieNumber);
        }
    }
}
