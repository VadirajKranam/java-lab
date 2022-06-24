package com.company;

import javax.swing.*;
import java.awt.*;

public class Gameframe extends JFrame {
    Gameframe(){

        this.add(new Gamepanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}