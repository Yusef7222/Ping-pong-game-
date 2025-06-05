package com.pingponggame.view;

import javax.swing.*;
import java.awt.*;

/**
 * Main window of the Ping Pong game.
 */
public class MainView extends JFrame {
    private JButton startButton;

    public MainView() {
        initUI();
    }

    private void initUI() {
        // Set frame properties (square 600x600)
        setTitle("Ping Pong Game");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Create button panel at top center
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        startButton = new JButton("Start Game");
        topPanel.add(startButton);

        add(topPanel, BorderLayout.NORTH);
    }

    public JButton getStartButton() {
        return startButton;
    }
}
