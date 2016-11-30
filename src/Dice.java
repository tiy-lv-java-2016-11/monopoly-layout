import java.util.Random;

/**
 * Created by melmo on 11/29/16.
 */
public class Dice {
    private int sides;

    public Dice(int sides){
        this.sides = sides;
    }

    public int roll() {
        Random rand = new Random();

        return rand.nextInt(this.sides) + 1;
    }

}
