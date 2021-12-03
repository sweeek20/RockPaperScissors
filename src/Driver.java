/** This program uses a game class and an RPSObject class to generate a Rock Paper Scissors game.
 * The game is played by a user and a subsequent computer generated response. The user will select an option
 * from the screen (rock, paper, or scissors), and the RPSObject class will be used to create a computer
 * response. The goal of the game is to win 3 rounds. The first player to 3 wins, and the game will then end.
 * @georgiaheadley
 * @erinsweeney
 */

import javax.swing.*;

public class Driver {
    public static void main(String[] args) {

        // create game space
        Game g = new Game();
        g.setup();

        g.setTitle("Rock Paper Scissors");
        g.setBounds(200, 200, 700, 600);
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        g.setResizable(false);
        g.setVisible(true);

    }
}
