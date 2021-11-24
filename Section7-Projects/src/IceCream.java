import java.util.ArrayList;

public class IceCream {
    private String name;
    private int cost;
    private int numScoops;
    private ArrayList<String> toppings;

    public IceCream(String name, int cost, int numScoops){
        this.cost = cost;
        this.name = name;
        this.numScoops = numScoops;
        toppings = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getNumScoops() {
        return numScoops;
    }

    public void addTopping(String topping){
        toppings.add(topping);
    }

    public void printToppings(){
        System.out.println("Toppings are");
        for(String topping: toppings)
            System.out.println("\t" + topping);
    }
}
