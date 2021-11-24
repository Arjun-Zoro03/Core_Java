public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream myIceCream = new IceCream("Chocolate", 3, 2);
        IceCream yourIceCream = new IceCream("Strawberry", 2, 1);

        myIceCream.addTopping("nuts");
        myIceCream.addTopping("cherries");

        yourIceCream.addTopping("sprinkles");

        printIceCream(myIceCream);
        printIceCream(yourIceCream);

    }

    public static void printIceCream(IceCream iceCream){
        System.out.println(iceCream.getName());
        System.out.println("Cost: " + iceCream.getCost());
        iceCream.printToppings();
        System.out.println();
    }
}
