package views;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel{
    JButton startButton;
    JButton stopButton;
    JButton resetButton;
    JButton speedButton;
    JButton aboutButton;
    JButton exitButton;

    public ButtonPanel() {
        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        resetButton = new JButton("Reset");
        speedButton = new JButton("Sebesség");
        aboutButton = new JButton("Névjegy");
        exitButton = new JButton("Kilépés");

        this.add(startButton);
        this.add(stopButton);
        this.add(resetButton);
        this.add(speedButton);
        this.add(aboutButton);
        this.add(exitButton);

        this.setBounds(5, 215, 750, 40);
        this.setLayout(new FlowLayout());

    }
}
