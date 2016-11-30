/**
 * Player
 * Name
 * Money
 * Token
 * Method to pay money
 * Method to receive money
 * Chance/Community Chest Card - Title, description
 */
public class Player {

    private String name;
    private int money;
    private String token;


    public Player (String name, int money, String token) {
        this.name = name;
        this.money = money;
        this.token = token;
    }

    public String getName() {
        return this.name;
    }

    public int getMoney() {
        return this.money;
    }

    public String getToken() {
        return this.token;
    }

    public void payMoney(int paid) {
        this.money = this.money - paid;
    }

    public void recieveMoney(int recieved) {
        this.money = this.money + recieved;
    }



  }




