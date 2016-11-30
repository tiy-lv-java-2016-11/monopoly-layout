/**
 * Created by lbregula on 11/29/16.
 */
public class Main {
    public static void main(String[] args) {
        Player bob = new Player("Bob", "hat");
        Property place = new Property("Las Vegas", "Red", 100, 100);
        ChanceCommunity card = new ChanceCommunity("Chance:", "go to jail");
        Board size = new Board(5, 5);

        System.out.println(bob.getName() + " " + bob.getMoney()
                + " " + bob.getToken());
        System.out.println(place.getName() + " " + place.getColor()
                + " " + place.getPrice() + " " + place.getMortgageValue());
        System.out.println(card.getTitle() + " " + card.getDescription());
    }
}