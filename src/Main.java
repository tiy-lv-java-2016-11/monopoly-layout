/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Player joey = new Player("joey", "dog");
        Property place = new Property("New York", "Blue", 2000, 500);
        ChanceCommunity card = new ChanceCommunity("Chance","Go to jail");
        NonProperty spot = new NonProperty("go to jail", "go to jail, do not pass go", 0);

        joey.takeMoney(200);
        joey.addMoney(500);


        System.out.println(joey.getName() + " " + joey.getMoney() + " " + joey.getToken());
        System.out.println(place.getName() + " " + place.getColor() + " " + place.getPrice() + " " +
        place.getMortgage());
        System.out.println(card.getTitle() + " " + card.getDescription());
        System.out.print(spot.getName() + " " + spot.getDescription() + " " + spot.getPrice());



    }
}
