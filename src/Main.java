/**
 * Created by melmo on 11/29/16.
 */
public class Main {

    public static void main(String[] args) {

        Property[] properties = new Property[28];

        properties[0] = new Property("mediterraneanAve", "purple", 60, 30);

        System.out.println(properties[0].toString());

        Player one = new Player("Ted", "Dog");

        System.out.println(one.toString());

        one.spendMoney(100);
//        properties[0].setOwned(true);

        System.out.println(one.toString());
        System.out.println(properties[0].toString());

        one.buyProperty(properties[0]);

        System.out.println(one.toString());
        System.out.println(properties[0].toString());

    }

}
