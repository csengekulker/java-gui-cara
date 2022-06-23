package controllers;

import javax.swing.Timer;

import models.MainModel;
import views.ButtonPanel;
import views.MainFrame;
import views.TrackPanel;
import views.Car;

public class MainController {
    MainFrame mainFrame;
    MainModel mainModel;

    ButtonPanel buttonPanel;
    TrackPanel trackPanel;

    Timer timer;

    public MainController() {
        this.mainFrame = new MainFrame();
        this.mainModel = new MainModel();

        timer = new Timer(300, action -> onTime());

        setEvents();
    }

    private void onTime() {

        trackPanel = this.mainFrame.trackPanel;

        int car1_x = trackPanel.car1.go();
        trackPanel.car1.setSpeed();
        isFinished(car1_x, trackPanel.car1);
    
        int car2_x = trackPanel.car2.go();
        trackPanel.car2.setSpeed();
        isFinished(car2_x, trackPanel.car2);

        int car3_x = trackPanel.car3.go();
        trackPanel.car3.setSpeed();
        isFinished(car3_x, trackPanel.car3);

    }

    private void isFinished(int x, Car car) {
        if (x >= 700) {
            System.out.println(car.getCarName());
            timer.stop();
        }

    }

    private void handleStartButtonAction() {
        timer.start();
    }

    private void handleStopButtonAction() {
        timer.stop();
    }

    private void handleResetButtonAction() {
        this.trackPanel = this.mainFrame.trackPanel;

        trackPanel.resetPosition();

        timer.stop();
    }

    private void handleExitButtonAction() {
        System.exit(0);
    }

    private void setEvents() {
        buttonPanel = this.mainFrame.buttonPanel;

        buttonPanel.startButton.addActionListener(action -> handleStartButtonAction());

        buttonPanel.stopButton.addActionListener(action -> handleStopButtonAction());

        buttonPanel.resetButton.addActionListener(action -> handleResetButtonAction());

        buttonPanel.exitButton.addActionListener(action -> handleExitButtonAction());

    }
    
}
