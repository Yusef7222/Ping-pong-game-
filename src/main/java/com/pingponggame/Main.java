package com.pingponggame;

import com.pingponggame.controller.MainController;
import com.pingponggame.model.PingPongModel;
import com.pingponggame.view.MainView;

import javax.swing.*;

/**
 * Entry point to launch the GUI.
 */
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PingPongModel model = new PingPongModel();
            MainView view = new MainView();
            new MainController(model, view);
            view.setVisible(true);
        });
    }
}
