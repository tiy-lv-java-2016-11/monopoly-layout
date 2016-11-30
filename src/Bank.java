/**
 * Created by darionmoore on 11/29/16.
 */
public class Bank {
    private int bankMoney ;
    private String hotels;

    public Bank(int bankMoney, String hotels) {
        this.bankMoney = bankMoney;
        this.hotels = hotels;

    }

    public int getBankMoney() {
        return this.bankMoney;


    }

    public String getHotels() {
        return this.hotels;

    }

    public void setBankMoney(int bankMoney) {
        this.bankMoney = bankMoney;
    }

    public void setHotels(String hotels) {
        this.hotels = hotels;
    }

    public void giveMoney(int payout) {
        this.bankMoney -= payout;
    }

    public void getMoney(int payin) {
        this.bankMoney += payin;
    }
}
