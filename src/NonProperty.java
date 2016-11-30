/**
 *
 */
public class NonProperty {
    private String name;
    private String description;
    private int price;
    private boolean isowned;

    public NonProperty(String name, String description, int price){
        this.name = name;
        this.description = description;
        this.price = price;
        this.isowned = false;

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

    public boolean isowned() {
        return isowned;
    }

    public void setIsowned(boolean isowned) {
        this.isowned = isowned;
    }
}
