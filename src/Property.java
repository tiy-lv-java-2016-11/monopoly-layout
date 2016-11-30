/**
 * Created by melmo on 11/29/16.
 */
public class Property {
    private String name;
    private String color;
    private int price;
    private int mortgageValue;
    private boolean owned;

//    public Property(Object prop) {
//        new Property(prop);
//    }

    public Property(String name, String color, int price, int mortgageValue){
        this.name = name;
        this.color = color;
        this.price = price;
        this.mortgageValue = mortgageValue;
        this.owned = false;
    }

    public String getName(){
        return this.name;
    }

    public String getColor(){
        return this.color;
    }

    public int getPrice(){
        return this.price;
    }

    public int getMortgageValue(){
        return this.mortgageValue;
    }

    public boolean getOwned(){
        return this.owned;
    }

    public void setOwned(boolean owned){
        this.owned = owned;
    }

    @Override
    public String toString() {
        return this.getName() + ", " +
               this.getColor() + ", " +
               this.getPrice() + ", " +
               this.getMortgageValue() + ", " +
                this.getOwned();
    }

}
