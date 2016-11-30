/**
 * Created by lbregula on 11/29/16.
 */
public class Board {
    private int length;
    private int width;
    private int spaces;

    public Board(int length, int width) {
        this.length = length;
        this.width = width;
        this.spaces = 41;
    }

    public int getLength() {return length;}
    public int getWidth() {return width;}
    public int getSpaces() {return spaces;}
}
