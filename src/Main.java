/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Player joey = new Player("joey", "dog");
        Property place = new Property("New York", "Blue", 2000, 500);
        ChanceCommunity card = new ChanceCommunity("Chance","Go to jail");
        NonProperty spot = new NonProperty("Luxury Tax", "must paid fine", 75);
        UtilitiesRailroads company = new UtilitiesRailroads("Short Line", 100, 5);

        joey.takeMoney(200);
        joey.addMoney(500);

        System.out.format("%s, %s, %s \n %s, %s, %s, %s \n %s, %s \n %s, %s, %s \n %s, %s, %s", joey.getName(), joey.getMoney(),
                joey.getToken(), place.getName(), place.getColor(), place.getPrice(), place.getMortgage(),
                card.getTitle(), card.getDescription(), spot.getName(), spot.getDescription(), spot.getPrice(),
                company.getTitle(), company.getPrice(), company.getMortgage());



    }
}
