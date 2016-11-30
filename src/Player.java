/**
 * Created by lbregula on 11/29/16.
 */
public class Player {
private String name;
private int money;
private String token;

public Player(String name, String token){
    this.name = name;
    this.money = 1500;
    this.token = token;
}

public String getName() {return this.name;}

public int getMoney() {return this.money;}

public String getToken() {return this.token;}


public void payMoney(int paid){
    this.money -= paid;
}

public void receiveMoney(int received){
    this.money += received;
}

}
