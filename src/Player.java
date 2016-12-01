/**
 *
 */
public class Player {
    private String name;
    private int money;
    private String token;

    public Player(String name, String token){
        this.name = name;
        this.token = token;
        this.money = 1500;
    }

    public String getName(){
        return this.name;
    }

    public String getToken(){
        return this.token;
    }

    public int getMoney(){
        return this.money;
    }

    public void addMoney(int amount){
        this.money += amount;
    }

    public void takeMoney(int amount){
        this.money = this.money - amount;
    }



}
