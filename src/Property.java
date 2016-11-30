/**
 *
 */
public class Property {
    private String name;
    private String color;
    private int price;
    private int mortgage;
    private boolean isowned;


    public Property(String name, String color, int price, int mortgage){
        this.name = name;
        this.color = color;
        this.price = price;
        this.mortgage = mortgage;
        this. isowned = false;
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
    public boolean getIsowned(){
        return this.isowned;
    }

    public void setIsowned(boolean isowned){
        this.isowned = isowned;
    }

}
