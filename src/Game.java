import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Game extends JFrame implements ActionListener {
    // declare private variables for the class
    private JButton rock, paper, scissors;
    private JTextField text1, text2, text3,  text4;
    int[] score = new int[2];


    // method to set up the game screen
    public void setup() {
        setSize(1000,500);
        setVisible(true);
        JLabel background=new JLabel(new ImageIcon("rockpaperscissors.png"));
        add(background);
        background.setLayout(new FlowLayout());

        text1 = new JTextField(15);
        background.add(text1);
;
        text2 = new JTextField(15);
        background.add(text2);


        text3 = new JTextField(30);
        background.add(text3);

        text4=new JTextField(30);
        text4.setBounds(250,400,30,5);
        background.add(text4);

        rock = new JButton("Rock");
        background.add(rock);
        rock.addActionListener(this);

        paper = new JButton("Paper");
        background.add(paper);
        paper.addActionListener(this);

        scissors = new JButton("Scissors");
        background.add(scissors);
        scissors.addActionListener(this);
    }

    // method for when player clicks on and chooses rock, paper, or scissors
    public void actionPerformed(ActionEvent event) {
        Object s = event.getSource();

        // if either player reaches a score of 3, they win and the game ends
        if (score[0] == 3) {
            text4.setText("Player wins. End of game.");
            JFrame.EXIT_ON_CLOSE();
            return;
        }
        if (score[1] == 3) {
            text4.setText("Computer wins. End of game.");
            JFrame.EXIT_ON_CLOSE();
            return;
        }
        // initializes variables used to keep track of player choice and computer choice
        int player = 0;
        int n = 0;
        String winner;

        // assign player choice to a respective numerical value
        if (s == rock) {
            player = 0;

        }
        else if (s == paper) {
            player = 1;

        }
        else if (s == scissors) {
            player = 2;
        }

        // create a RPSObject for computer action
        RPSObject computer1 = new RPSObject(3);
        computer1.outcome(); // call outcome method of RPSObject class
        n = computer1.getValue(); // call getValue method to get the computer's choice

        //output what computer choice was (rock, paper or scissors)
        if (n == 0) {
            text2.setText("Computer throws Rock");
        }
        if (n == 1) {
            text2.setText("Computer throws Paper");
        }
        if (n == 2) {
            text2.setText("Computer throws Scissors");
        }

        // call winner method to determine the winner of this round
        winner = winner(player, n);
        text1.setText("Winner of round: " + winner); // display the winner to the scree

        // if the computer wins, increase the computer's total score by 1
        if (winner.equals("Computer")) {
            score[1]++;
        }
        // if the player wins, increase the computer's total score by 1
        else if (winner.equals("Player")) {
            score[0]++;
        }

        // display the respective scores on the screen
        text3.setText("Player Score: " + score[0] + "  Computer score:  " + score[1]);

    }

    // winner method to determine who won the round
    public static String winner(int player, int n){
        String winner;
        // if player choice (numerical value) equals computer choice (numerical value), game is a tie
        if (player == n){
            winner = "Tie";
        }
        // if player chooses rock and computer chooses paper, computer wins
        else if (player == 0 && n == 1){
            winner = "Computer";
        }
        // if player chooses paper and computer chooses scissors, computer wins
        else if (player == 1 && n == 2){
            winner="Computer";
        }
        // if player chooses scissors and computer chooses rock, computer wins
        else if (player == 2 && n == 0){
            winner="Computer";
        }
        // if not a tie, and computer does not win, player wins
        else {
            winner = "Player";
        }
        // return who is the winner as a String
        return winner;

    }
}





