public class HouseDemo {
    public static void main(String[] args) {
        House myHouse = new House();
        House yourHouse = new House(3, 10, "blue");

        myHouse.setHouseStories(2);
        myHouse.setWindows(6);
        myHouse.setColor("red");

//        yourHouse.setHouseStories(3);
//        yourHouse.setWindows(10);
//        yourHouse.setColor("blue");

//        System.out.println("My House is " + myHouse.getColor() + " and has " + myHouse.getHouseStories() +
//                " stories and " + myHouse.getWindows() + " windows.");
//
//        System.out.println("Your House is " + yourHouse.getColor() + " and has " + yourHouse.getHouseStories() +
//                " stories and " + yourHouse.getWindows() + " windows.");

        printHouseData(myHouse);
        printHouseData(yourHouse);

    }


    public static void printHouseData(House house) {
        System.out.println("TheHouse is " + house.getColor() + " and has " + house.getHouseStories() +
                " stories and " + house.getWindows() + " windows.");
    }
}
