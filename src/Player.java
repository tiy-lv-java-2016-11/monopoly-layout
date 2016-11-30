/**
 * Created by melmo on 11/29/16.
 */
public class Player {
    private String name;
    private String token;
    private int money;
    private Property[] properties = new Property[28];

    public Player (String name, String token) {
        this.name = name;
        this.token = token;
        this.money = 1500;
    }

    public String getName() {
        return this.name;
    }

    public String getToken() {
        return this.token;
    }

    public int getMoney() {
        return this.money;
    }

    public void spendMoney (int value) {
        if(value <= 0) {
            System.out.println("Enter a value greater than $0");
        }
        else if (value > this.money) {
            System.out.println(this.name + " does not have enough money");
        }
        else {
            this.money -= value;
        }
    }

    public void receiveMoney (int value) {
        if (value <= 0) {
            System.out.println("Enter a value greater than $0");
        }
        else {
            this.money += value;
        }
    }

    public void buyProperty(Property prop) {
        this.spendMoney(prop.getPrice());
        prop.setOwned(true);
        this.properties[0] = new Property(prop.getName(), prop.getColor(), prop.getPrice(), prop.getMortgageValue());
    }

    @Override
    public String toString() {
        return this.getName() + ", " +
               this.getToken() + ", " +
               this.getMoney();
    }

}
