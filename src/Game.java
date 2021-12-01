import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Game extends JFrame implements ActionListener {
    private JButton rock, paper, scissors;
    private JTextField text1, text2;

    public void setup() {
        //JFrame obj = new JFrame();
        setSize(600,400);
        setVisible(true);
        JLabel background=new JLabel(new ImageIcon("rockpaperscissors.png"));
        add(background);
        background.setLayout(new FlowLayout());

        //Container window = getContentPane();
        //window.setLayout(new FlowLayout());
        text1 = new JTextField(15);
        background.add(text1);

        text2 = new JTextField(15);
        background.add(text2);

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

    public void actionPerformed(ActionEvent event){
        Object s= event.getSource();
        int player=0;
        int computer=0;
        String winner;
        Random rand=new Random();
        if (s==rock){
            player=0;

        }else if(s==paper){
            player=1;

        }else if (s==scissors){
            player=2;
        }

        computer=rand.nextInt(3);
        //insert winner call to method here
        winner=winner(player,computer);
        text1.setText("Winner of round: " + winner);

        //output what computer choice was (rock, paper or scissors
        if (computer==0){
            text2.setText("Computer throws Rock");
        }
        if (computer==1){
            text2.setText("Computer throws Paper");
        }
        if (computer==2){
            text2.setText("Computer throws Scissors");
        }


        //best of 3 rounds ??
        //add a score keeper/total score output

    }




    //rock 0
    //paper 1
    //scissors 2
    //check winner method

    private String winner(int player, int computer){
        String winner;
        if (player==computer){
            winner="Tie";
        } else if (player==0 && computer ==1){
            winner="Computer";
        }else if(player==1&& computer==2){
            winner="Computer";
        }else if(player==2 && computer==0){
            winner="Computer";
        }else{
            winner="Player";
        }
        return winner;

    }


}





