/**
 * Created by sparatan117 on 11/30/16.
 */
public class UtilitiesRailroads {
    private String title;
    private int price;
    private int mortgage;
    private boolean isOwned;

    public UtilitiesRailroads(String title, int price, int mortgage) {
        this.title = title;
        this.price = price;
        this.mortgage = mortgage;
        this.isOwned = false;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public int getMortgage() {
        return mortgage;
    }

    public boolean isOwned() {
        return isOwned;
    }

    public void setOwned(boolean owned) {
        isOwned = owned;
    }
}
