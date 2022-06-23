package controllers;

import javax.swing.Timer;

import models.MainModel;
import views.ButtonPanel;
import views.MainFrame;
import views.TrackPanel;

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

        this.mainFrame.trackPanel.car1.go();
        this.mainFrame.trackPanel.car1.setSpeed();
    
        this.mainFrame.trackPanel.car2.go();
        this.mainFrame.trackPanel.car2.setSpeed();

        this.mainFrame.trackPanel.car3.go();
        this.mainFrame.trackPanel.car3.setSpeed();
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
