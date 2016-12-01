/**
 * Created by strejolopez on 11/29/16.
 */
public class Property {
    private String name;
    private String color;
    private int price;
    private int mortgageValue;
    private boolean isOwned;

    public Property(String name, String color, int price, int mortgageValue){
        this.name = name;
        this.color = color;
        this.price = price;
        this.mortgageValue = mortgageValue;
        this.isOwned = false;

    //public Property(String name, String color){
        //this.name = name;
       // this.color = color;
       // this.price = price;
      //  this.mortgageValue = mortgageValue;
        //this.isOwned = false;





    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public int getPrice() {
        return this.price;
    }

    public int getMortgageValue() {
        return this.mortgageValue;
    }

    public boolean getIsOwned() {
        return this.isOwned;
    }
}
