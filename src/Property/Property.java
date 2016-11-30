package Property;

/**
 * Created by darionmoore on 11/29/16.
 */
//  * Name: doesn't change
//	* Price: doesn't change
//	* Mortgage value: doesn't change
//	* Color: doesn't change
//	* Owned: can change

    public class Property {

    private String name;
    private int price;
    private int mortgageValue;
    private String color;
    private boolean owned;

    public Property(String name, int price, int mortageValue, String color) {
        this.name = name;
        this.price = price;
        this.mortgageValue = mortageValue;
        this.color = color;
        this.owned = false;

    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public int getMortgageValue() {
        return this.mortgageValue;
    }

    public String getColor() {
        return this.color;
    }

    public boolean getOwned() {
        return this.owned;
    }

    public void setOwned(boolean owned) {
        this.owned = owned;

    }








}
