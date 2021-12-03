import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Game extends JFrame implements ActionListener {
    private JButton rock, paper, scissors;
    private JTextField text1, text2, text3;
    int[] score = new int[2];

    public void setup() {
        setSize(800,400);
        setVisible(true);
        JLabel background=new JLabel(new ImageIcon("rockpaperscissors.png"));
        add(background);
        background.setLayout(new FlowLayout());

        text1 = new JTextField(13);
        background.add(text1);


        text2 = new JTextField(13);
        text2.setBounds(500,250,75,5);
        background.add(text2);

        text3 = new JTextField(13);
        text3.setBounds(500,100,75,5);
        background.add(text3);


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

    public void actionPerformed(ActionEvent event) {
        Object s = event.getSource();

        while (true) {
            System.out.println("in actionPerformed");
            int player = 0;
            int n = 0;
            String winner;

            if (s == rock) {
                player = 0;

            } else if (s == paper) {
                player = 1;

            } else if (s == scissors) {
                player = 2;
            }

            RPSObject computer1 = new RPSObject(3);
            computer1.outcome();
            n = computer1.getValue();

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

            //insert winner call to method here
            winner = winner(player, n);
            text1.setText("Winner of round: " + winner);

            if (winner.equals("Computer")) {
                score[1]++;
            }
            else if (winner.equals("Player")) {
                score[0]++;
            }
            text3.setText("Player Score: " + score[0] + "  Computer score:  " + score[1]);


            if (score[0] < 3 && score[1] < 3) {
                continue;
            }
            if (score[0] == 2) {
                System.out.println("Player wins best out of 3. End of game.");
                break;

            }
            if (score[1] == 2) {
                System.out.println("Computer wins best out of 3. End of game.");
                break;
            }
        }
    }

    public static String winner(int player, int n){
        String winner;
        if (player == n){
            winner = "Tie";
        }
        else if (player == 0 && n == 1){
            winner = "Computer";
        }
        else if (player == 1 && n == 2){
            winner="Computer";
        }
        else if (player == 2 && n == 0){
            winner="Computer";
        }
        else {
            winner = "Player";
        }
        return winner;

    }
}





