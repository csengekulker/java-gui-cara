package controllers;

import javax.swing.Timer;

import models.MainModel;
import views.ButtonPanel;
import views.MainFrame;

public class MainController {
    MainFrame mainFrame;
    MainModel mainModel;

    ButtonPanel buttonPanel;

    Timer timer;

    public MainController() {
        this.mainFrame = new MainFrame();
        this.mainModel = new MainModel();

        timer = new Timer(400, action -> onTime());

        setEvents();
    }

    private void onTime() {

        this.mainFrame.trackPanel.car1.go();
        this.mainFrame.trackPanel.car2.go();
        this.mainFrame.trackPanel.car3.go();
    }

    private void handleStartButtonAction() {
        timer.start();
    }

    private void setEvents() {
        buttonPanel = this.mainFrame.buttonPanel;

        buttonPanel.startButton.addActionListener(action -> handleStartButtonAction());

    }
    
}
