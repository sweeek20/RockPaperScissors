import java.util.Random;

public class RPSObject {
    private int value;
    private int options;
    Random rand = new Random();

    public RPSObject() {
        this.options = 3;
        this.value = 0;
    }

    public RPSObject(int options) {
        this.options = options;
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void outcome() {
        this.value = rand.nextInt(options);
    }
}
