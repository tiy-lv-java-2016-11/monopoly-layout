/**
 *
 */
public class Property {
    private String name;
    private String color;
    private int price;
    private int mortgage;
    private boolean isOwned;


    public Property(String name, String color, int price, int mortgage){
        this.name = name;
        this.color = color;
        this.price = price;
        this.mortgage = mortgage;
        this.isOwned = false;
    }

    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }

    public int getMortgage(){
        return this.mortgage;
    }

    public String getColor(){
        return this.color;
    }
    public boolean getOwned(){
        return this.isOwned;
    }

    public void setOwned(boolean owned){
        this.isOwned = owned;
    }

}
