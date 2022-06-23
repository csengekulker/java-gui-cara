package views;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;

public class Car extends JButton{

    Integer actSpeed;
    int maxSpeed;
    boolean speedVisible;

    public Car(Color color, int initSpeed, String name) {

        this.setBackground(color);
        this.setText(name);
        this.actSpeed = initSpeed;
        this.maxSpeed = 20;
        this.speedVisible = true;
    }

    public Integer getActSpeed() {
        return this.actSpeed;
    }

    public void go() {
        int x = this.getLocation().x;
        int y = this.getLocation().y;
        x = x + this.actSpeed;
        this.setLocation(x, y);
    }

    public void setSpeed() {
        int accelvalue = getAccelValue();
        if (canAccelerate()) { // true
            
            increaseSpeed(accelvalue);
        } else if (!canAccelerate()) {

            decreaseSpeed(accelvalue);
        }
    }

    private boolean canAccelerate() {
        Random r = new Random();

        boolean accelerates = r.nextBoolean();

        return accelerates;
    }

    private int getAccelValue() {
        Random r = new Random();

        return r.nextInt(3) + 1;
    }

    private void increaseSpeed(int speed) {
        int newSpeed = this.actSpeed += speed;

        if (newSpeed < maxSpeed) {
            this.actSpeed = newSpeed;
        }
    }

    private void decreaseSpeed(int speed) {
        int newSpeed = this.actSpeed -= speed;

        if (newSpeed > 0) {
            this.actSpeed = newSpeed;
        }
    }
}
