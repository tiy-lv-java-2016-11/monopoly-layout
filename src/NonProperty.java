/**
 *
 */
public class NonProperty {
    private String name;
    private String description;
    private int price;

    public NonProperty(String name, String description, int price){
        this.name = name;
        this.description = description;
        this.price = price;

    }
    public String getName(){
        return this.name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }
}
