import java.util.Random;

public class RPSObject {
    // declare private variables for the RPSObject class
    private int value;
    private int options;
    Random rand = new Random();

    // default constructor method
    public RPSObject() {
        this.options = 3;
        this.value = 0;
    }

    // constructor method takes input of the number of options and creates an RPSObject with that number of options
    public RPSObject(int options) {
        this.options = options;
        this.value = 0;
    }

    // outcome class generates a random number (with bounds being the number of options) indicating which choice the computer will make (rock, paper, or scissors)
    public void outcome() {
        this.value = rand.nextInt(options);
    }

    // getValue class returns the value determined in the outcome class
    public int getValue() {
        return value;
    }
}
