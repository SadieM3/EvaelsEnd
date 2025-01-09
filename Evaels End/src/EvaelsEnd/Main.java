package EvaelsEnd;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Evael's End");
        gamePanel GamePanel = new gamePanel();
        window.add(GamePanel);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        GamePanel.startGameThread();
        //Scanner keyboard = new Scanner(System.in);
    }
}