/**
 * Created by strejolopez on 11/29/16.
 */
public class Player {
    private String name;
    private String token;
    private int money;

    public Player(String name, String token) {
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


    public void payMoney(int amount) {
        if(money < 1500) {
            this.money -= amount;
        System.out.println();
    }
    else{
            System.out.println(this.money-= amount);
            System.out.println("Losing money");
        }
        }

    public void receiveMoney(int amount) {
        if (money > 1500) {
            this.money += amount;
        } else {
            System.out.println(this.money += amount);
            System.out.println("Thanks for the money");
        }
    }





}

