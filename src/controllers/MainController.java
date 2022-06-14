package controllers;

import models.MainModel;
import views.ButtonPanel;
import views.MainFrame;

public class MainController {
    MainFrame mainFrame;
    MainModel mainModel;

    ButtonPanel buttonPanel;
    public MainController() {
        this.mainFrame = new MainFrame();
        this.mainModel = new MainModel();
    }

    private void setEvents() {
        buttonPanel = this.mainFrame.buttonPanel;
    }
    
}
