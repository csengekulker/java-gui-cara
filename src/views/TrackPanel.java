package views;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class TrackPanel extends JPanel {
    public Car car1;
    public Car car2;
    public Car car3;

    public TrackPanel() {

        this.car1 = new Car(new Color(135, 83, 175), 5, "(●'◡'●)");
        this.car1.setBounds(5, 5, 100, 30);

        this.car2 = new Car(new Color(103, 159, 223), 5, "¯\\_(ツ)_/¯");
        this.car2.setBounds(5, 50, 100, 30);

        this.car3 = new Car(new Color(135, 201, 97), 5, "╰(*°▽°*)╯");
        this.car3.setBounds(5, 95, 100, 30);

        this.add(this.car1);
        this.add(this.car2);
        this.add(this.car3);
        this.setBounds(5, 5, 750, 150);
        Border border = BorderFactory.createLineBorder(Color.BLUE);
        this.setBorder(border);
        this.setLayout(null);
    }


    // public void paint(Graphics g) {
    //     g.setColor(Color.RED);
    //     g.fillRect(300, 20, 10, 40);
    // }

    public void resetPosition() {
        car1.setLocation(5, 5);
        car2.setLocation(5, 50);
        car3.setLocation(5, 95);
    }
}
