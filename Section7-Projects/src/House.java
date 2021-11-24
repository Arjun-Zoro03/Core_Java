public class House {
    private int houseStories;
    private int windows;
    private String color;

    public House(){
        houseStories = 1;
        windows = 4;
        color = "grey";
    }

    public House(int houseStories, int windows,String color){
        this.color = color;
        this.houseStories = houseStories;
        this.windows = windows;

    }


    public int getHouseStories() {
        return houseStories;
    }

    public void setHouseStories(int houseStories) {
        this.houseStories = houseStories;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
