/**
 * Created by darionmoore on 11/29/16.
 */
public class Cards {
    private String chanceCard;
    private String communityChest;

    public String getCommunityChest() {
        System.out.println("You drew a Community Chest card! Pay everyone 50$");
        return communityChest;


    }

    public String getChanceCard() {
        System.out.println("You drew a Chance card! Proceed to Jail! Do not pass GO, DO NOT collect 200$");
        return chanceCard;


    }


}
