/**
 * Created by lbregula on 11/29/16.
 */
public class Property {
    private String name;
    private String color;
    private boolean isOwned;
    private int price;
    private int mortgageValue;

    public Property(String name, String color, int price, int mortgageValue){
        this.name = name;
        this.color = color;
        this.isOwned = false;
        this.price = price;
        this.mortgageValue = mortgageValue;
    }

    public String getName() {return this.name;}

    public String getColor() {return this.color;}

    public boolean getIsOwned() {return this.isOwned;}

    public int getPrice() {return this.price;}

    public int getMortgageValue() {return this.mortgageValue;}

    public void setIsOwned(boolean isOwned) {this.isOwned = isOwned;}
}
