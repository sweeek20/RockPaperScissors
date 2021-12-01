import javax.swing.*;

public class Driver {
    public static void main(String[] args) {
        //create game space
        Game g = new Game();
        //g.setSize(250, 150);
        g.setup();

        g.setTitle("Rock Paper Scissors");
        g.setBounds(200,200,700,600);
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        g.setResizable(false);
        g.setVisible(true);
        g.add(g);

    }
}
