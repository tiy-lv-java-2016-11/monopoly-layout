/**
 * Created by strejolopez on 11/29/16.

public class Main {

    public static void main(String[] args){
        Cards cardsOne = new Cards("Chance:","You inherit $100!!!!");

        System.out.println(cardsOne.getTitle() + " " + cardsOne.getDescription());
    }



}
*/

public class Main {

    public static void main(String[] args) {

        Player userOne = new Player("Sajid", "Boot");
        System.out.println(userOne.getName() + " " + userOne.getToken());
        userOne.receiveMoney(2000);


        Player userTwo = new Player("Teddy","Ship");
        System.out.println(userTwo.getName() + " " + userTwo.getToken());
        userTwo.payMoney(500);


        Cards cardsOne = new Cards("Chance:","You inherit $100!!!!");
        System.out.println(cardsOne.getTitle() + " " + cardsOne.getDescription());

        Property newHouse = new Property("Marvin Gardens", "Yellow", 24, 240);
        System.out.println(newHouse.getName() + " " + newHouse.getColor() + " " + newHouse.getPrice() + " " + newHouse.getMortgageValue());


    }








    }
