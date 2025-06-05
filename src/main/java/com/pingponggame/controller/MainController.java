package com.pingponggame.controller;

import com.pingponggame.model.PingPongModel;
import com.pingponggame.view.MainView;

/**
 * Controller connecting the model and the view.
 */
public class MainController {
    private final PingPongModel model;
    private final MainView view;

    public MainController(PingPongModel model, MainView view) {
        this.model = model;
        this.view = view;
        initController();
    }

    private void initController() {
        // Future event hooks for the view will go here
        view.getStartButton().addActionListener(e -> onStartGame());
    }

    private void onStartGame() {
        // Placeholder for start game logic
        System.out.println("Start Game clicked");
    }
}
