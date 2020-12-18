package com.compan;

import com.sun.glass.ui.Application;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;

public class Main {
    private JFrame window;

    public Main() throws Exception {
        window = new JFrame(new sittings().test());
        window.setSize(300, 160);
        window.add(new sittings());
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setVisible(true);


    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new Main();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
    }
}
